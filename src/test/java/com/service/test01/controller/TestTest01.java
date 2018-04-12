package com.service.test01.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTest01 {

        Test01Delegate test01Delegate = new Test01Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = test01Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}