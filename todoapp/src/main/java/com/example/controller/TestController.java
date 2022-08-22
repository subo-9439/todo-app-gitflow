package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
 
  @GetMapping("/todo")
  public String getTodo(){
    String str = "To-do Application!";
    System.out.println(str);
    return str;
  }
}