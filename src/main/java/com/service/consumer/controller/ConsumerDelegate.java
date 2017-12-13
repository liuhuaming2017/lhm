package com.service.consumer.controller;

import org.springframework.stereotype.Component;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerDelegate {
    
    private static RestTemplate restTemplate = RestTemplateBuilder.create();
    
    public String helloworld(String name){
        // Do Some Magic Here!
         String helloworld = restTemplate.getForObject("cse://provider1/helloworld?name="+name, null, String.class);
        return helloworld;
    }
    public String getuname(String name,String test){
        String helloworld = restTemplate.getForObject("cse://provider1/getuname?name="+ name + "&test=" + test, null, String.class);
        return helloworld;
    }
}
