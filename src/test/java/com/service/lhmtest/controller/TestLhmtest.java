package com.service.lhmtest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLhmtest {

        LhmtestDelegate lhmtestDelegate = new LhmtestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lhmtestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}