package com.service.consumer.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestConsumer {

        ConsumerDelegate consumerDelegate = new ConsumerDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = consumerDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}