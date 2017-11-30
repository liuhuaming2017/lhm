package com.service.lhmtest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-30T08:50:39.126Z")

@RestSchema(schemaId = "lhmtest")
@RequestMapping(path = "/lhmtest", produces = MediaType.APPLICATION_JSON)
public class LhmtestImpl {

    @Autowired
    private LhmtestDelegate userLhmtestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLhmtestDelegate.helloworld(name);
    }

}
