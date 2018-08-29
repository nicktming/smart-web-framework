package com.example.proxy.staticproxy;

import com.example.proxy.staticproxy.Hello;

public class HelloImpl implements Hello {
    public void say(String name) {
        System.out.println("Hello! " + name);
    }
}
