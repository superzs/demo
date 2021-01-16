package com.designPattern.creational.factoryMethod;

/**
 * Created by hongjingjun on 16/2/13.
 */

class MyDocument implements IDocument {

	public void open() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}}

class TextDocument implements IDocument {

	public void open() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}
}

class MyApplication extends Application {

    @Override
    protected IDocument createDocument() {
        return new MyDocument();
    }
}

class TextApplication extends Application {

    @Override
    protected IDocument createDocument() {
        return new TextDocument();
    }
}

public class MainClass {

    public static void main(String[] argv) {

        IDocument doc = new MyApplication().newDocument();
        doc.open();
        doc.save();
        doc.close();

        IDocument txt = new TextApplication().newDocument();
        txt.open();
        txt.save();
        txt.close();
    }
}
