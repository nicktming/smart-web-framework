package com.example.proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");
    }
}
