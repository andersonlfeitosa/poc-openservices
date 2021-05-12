package com.acme.authorizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
public class AuthorizerController {

    @GetMapping("/")
    public Result get() {
        return new Result(LocalDateTime.now(), "1", UUID.randomUUID().toString());
    }

}
