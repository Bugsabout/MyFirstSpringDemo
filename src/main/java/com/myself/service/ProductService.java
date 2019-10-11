package com.myself.service;

import org.springframework.stereotype.Component;

//主要进行AOP试验
@Component("s")
public class ProductService {
    public void doSomeService() {
        System.out.println("doSomeService");
    }
}
