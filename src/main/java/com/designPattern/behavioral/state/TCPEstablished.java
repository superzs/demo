package com.designPattern.behavioral.state;

/**
 * Created by hongjingjun on 16/2/15.
 */
public class TCPEstablished implements TCPState {

    public void open(TCPConnection connection) {

    }

    public void close(TCPConnection connection) {

        //establisted->closed

        //....

        //ok
        connection.changeState(new TCPClosed());
    }

    public void acknowledge(TCPConnection connection) {

    }
}
