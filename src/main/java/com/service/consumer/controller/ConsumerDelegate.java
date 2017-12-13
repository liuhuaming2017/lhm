package com.service.consumer.controller;

import org.springframework.stereotype.Component;


@Component
public class ConsumerDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
