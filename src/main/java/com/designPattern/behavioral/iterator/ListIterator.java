package com.designPattern.behavioral.iterator;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ListIterator implements Iterator {

    private ArrayList<Object> list = null;
    private int current = 0;

    public ListIterator(ArrayList<Object> list) {

        this.list = list;
        this.current = 0;
    }

    public void first() {
        current = 0;
    }

    public void next() {
        current++;
    }

    public boolean isDone() {
        return current >= list.size();
    }

    public Object currentItem() {
        return list.get(current);
    }
}
