package com.studyspringboot.studyspringboot.common;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.PumpStreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.*;

/**
 * Createc by lwx0y01 on 2019/12/16
 */
public class CommonExec {

    private static Logger logger = LoggerFactory.getLogger(CommonExec.class);

    private CommandLine commandLineArgs(Map<String, String> map) {
        CommandLine line = new CommandLine(map.get("command"));
        Map<String, String> fileMap = new HashMap<>();
        fileMap.put("fileSh", "DB_FILE_LOCATION" + File.separator + "exportStructure.sh");
        line.setSubstitutionMap(fileMap);
        line.addArgument("${fileSh}", false);
        line.addArgument("${sshRsa}", false);
        line.addArgument(map.get("first"), false);
        return line;
    }

    public static Map<String, String> runCommand(CommandLine commandLine, int timeout) {
        Map<String, String> resultMap = new HashMap<>();
        try {
            // 接收正常结果流
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            // 接收异常结果流
            ByteArrayOutputStream errorOutputStrem = new ByteArrayOutputStream();
            logger.info(commandLine.getExecutable());
            DefaultExecutor defaultExecutor = new DefaultExecutor();
            defaultExecutor.setExitValues(null);
            // 设置超时时间(单位：分钟)
            ExecuteWatchdog executeWatchDog = new ExecuteWatchdog(timeout * 60 * 1000);
            defaultExecutor.setWatchdog(executeWatchDog);
            PumpStreamHandler pumpStreamHandler = new PumpStreamHandler(outputStream, errorOutputStrem);
            logger.info("开始调用shell...");
            defaultExecutor.setStreamHandler(pumpStreamHandler);
            logger.info("commandLine :" + commandLine);
            int count = defaultExecutor.execute(commandLine);// count = 0 表示成功，count = 1 表示失败或出错
            String restStr = outputStream.toString("UTF-8");
            resultMap.put("count", String.valueOf(count));
            resultMap.put("restStr", restStr);
            if (count == 0) {
                logger.info("restStr: " + restStr);
                return resultMap;
            } else {
                logger.info("restStr: " + restStr);
                return resultMap;
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    private Map<String, String> start(Map<String, String> map) {
        Map<String, String> result = new HashMap<>();
        CommandLine line = commandLineArgs(map);
        Integer timeout = Integer.valueOf(map.get("timeout"));
        result = runCommand(line, timeout);
        logger.info(result.get("count"));
        logger.info(result.get("restStr"));
        return result;
    }
}
