package com.cheng.qq.common;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class UserValue extends User {
    private Socket socket;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    @Override
    public String toString() {
        return "UserValue [input=" + input + ", output=" + output + ", socket="
                + socket + "]";
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public ObjectOutputStream getOutput() {
        return output;
    }

    public void setOutput(ObjectOutputStream output) {
        this.output = output;
    }

    public ObjectInputStream getInput() {
        return input;
    }

    public void setInput(ObjectInputStream input) {
        this.input = input;
    }
}
