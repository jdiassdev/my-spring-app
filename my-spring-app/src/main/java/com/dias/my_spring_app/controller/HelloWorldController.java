package com.dias.my_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dias.my_spring_app.domain.User;
import com.dias.my_spring_app.service.HelloWorldService;

// STATELESS >> recebo todas as informaçoes que eu precisopara realizar alguma fnçao
// |> send e recive
// STATEFULL >> o estado de cada cliente é mantida no servidor
// para criar aplicaçoes rest
@RestController
@RequestMapping("/")
public class HelloWorldController {
     /*
      * Para injetar service no controller
      * com @Autowired sobreescreve e injeta
      * 
      * com public fn HelloWorldController()....
      * tbm funciona
      */

     @Autowired
     private HelloWorldService helloWorldService;

     // public HelloWorldController(HelloWorldService helloWorldService) {
     // this.helloWorldService = helloWorldService;
     // }

     // dentro da class dizemos qual verbo http ele serve
     // @GetMapping("/hello-wolrd") > nomear é opcional padrao rest o verbo diz oq a
     // rota faz
     @GetMapping
     public String helloWorld() {
          return helloWorldService.helloWorldSer("João  Dias");
     }

     @PostMapping
     /*
      * @RequestBody > pode ser dinamico poderia ser
      * |> (@RequestBody String body)
      */
     public String helloWorldPost(@RequestBody User body) {
          return "Post do " + body.getName() + " com email de " + body.getEmail();
     }

     @PostMapping("/{id}")
     public String helloWorldPostWithPathVariables(@PathVariable String id, @RequestBody User body) {
          return "Post do " + body.getName() + " com email de " + body.getEmail() + " " + id;
     }

     @PostMapping("/hp")
     public String helloWorldPostWithParams(@RequestParam(value = "filter", defaultValue = "") String filter, @RequestBody User body) {
          return "Post do " +  filter;
     }
}
