package com.webservice.board.web;

import com.webservice.board.web.dto.BasicResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/basic")
    public String basic() {
        return "basic";
    }

    @GetMapping("/basic/dto")
    public BasicResponseDto basicDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        System.out.println("@@@@@@@@@@@@@@@ " + name + ", " + amount);
        return new BasicResponseDto(name, amount);
    }
}
