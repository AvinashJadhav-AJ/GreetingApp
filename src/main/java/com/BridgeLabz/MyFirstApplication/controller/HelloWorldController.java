package com.BridgeLabz.MyFirstApplication.controller;

import com.BridgeLabz.MyFirstApplication.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello World !!!";
    }

    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name) {
        return  "hello " + name + " !!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "hello" +  name + "!";
    }

    @PostMapping ("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !";
    }

    @PutMapping ("/put/{FirstName}")
    public String sayHelloPut(@PathVariable String FirstName,@RequestParam(value="LastName") String lastName) {
        return "Hello" + FirstName + " " + " !";
    }
}
