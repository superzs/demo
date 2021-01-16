package com.designPattern.structual.proxy;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class ImageProxy implements Graphic {

    private Image image = null;

    public void draw() {

        if (image == null) {
            image = new Image();
        }

        image.draw();
    }

    public Object store() {
        return null;
    }

    public void load() {

    }
}
