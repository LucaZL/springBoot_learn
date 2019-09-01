package com.example.demo.controller;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello world", new HelloWorldController().sayHello());
    }
}
