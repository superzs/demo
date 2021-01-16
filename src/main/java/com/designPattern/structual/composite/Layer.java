package com.designPattern.structual.composite;

import java.util.ArrayList;

/**
 * Created by hongjingjun on 16/2/14.
 */

public class Layer implements Graphic {

    private ArrayList<Graphic> subs = new ArrayList<Graphic>();

    public void draw() {

        for (Graphic g: subs) {

            g.draw();
        }
    }

    public void add(Graphic g) {

        subs.add(g);
    }

    public void remove(Graphic g) {
        subs.remove(g);
    }

    public ArrayList<Graphic> getChilds() {
        return subs;
    }
}
