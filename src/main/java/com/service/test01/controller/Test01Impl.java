package com.service.test01.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-12T11:39:50.059Z")

@RestSchema(schemaId = "test01")
@RequestMapping(path = "/test01", produces = MediaType.APPLICATION_JSON)
public class Test01Impl {

    @Autowired
    private Test01Delegate userTest01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest01Delegate.helloworld(name);
    }

}
