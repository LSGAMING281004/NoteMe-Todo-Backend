package com.todo.NoteMe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {

    @GetMapping("/")
    public String home()
    {
        return "Hello World";
    }
}
