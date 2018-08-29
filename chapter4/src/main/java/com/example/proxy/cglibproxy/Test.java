package com.example.proxy.cglibproxy;

public class Test {
    public static void main(String[] args) {
        //CGLibProxy cgLibProxy = new CGLibProxy();
        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        //System.out.println("helloProxy:" + helloProxy);
        helloProxy.say("Jack");
    }
}
