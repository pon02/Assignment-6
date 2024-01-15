package com.pon.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/helloworld")
    public HelloworldResponce helloworld() {
        return new HelloworldResponce("Hello World!");
    }
    @GetMapping("/hellocat")
    public HellocatResponse hellocat() {
        return new HellocatResponse("Unyan", "Hello Unyan!", "Unya!");
    }
}
