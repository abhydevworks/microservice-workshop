package abhy.microservices.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello World !!";
    }
}
