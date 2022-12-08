package com.arseeniy.calculator;

import com.arseeniy.calculator.service.demoservice.DemoServiceImpl;

public class MainClass {
    public static void main(String[] args) {
        DemoServiceImpl demoService = new DemoServiceImpl();
        demoService.startTest();
    }
}
