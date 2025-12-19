package com.dias.my_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

     public String helloWorldSer(String name) {
          return "Hello World Service! " + name;
     }

}
