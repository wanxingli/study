package com.studyspringboot.studyspringboot.designPattern.dp.action.classandclassrelation.iterator;


public class MyCollection implements Collection {

    //声明数组集合
    public String string[] = { "A", "B", "C", "D", "E" };

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}