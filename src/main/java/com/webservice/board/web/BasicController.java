package com.webservice.board.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/basic")
    public String basic() {
        return "basic";
    }
}
