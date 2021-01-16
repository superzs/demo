package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class TCPClosed implements TCPState {

    public void open(TCPConnection connection) {

        //closed->listen

        //....

        //ok
        connection.changeState(new TCPListen());

    }

    public void close(TCPConnection connection) {

    }

    public void acknowledge(TCPConnection connection) {

    }
}
