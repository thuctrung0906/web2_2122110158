package com.example.thuc;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/")
    public String index() {
        return "Hello World Spring Boot Java";

        
    }
    @PostMapping("/create")
    public String create(@RequestBody String data) {
        return "Them: " + data;
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody String data) {
        return "Sua " + id + " du lieu: " + data;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return "Xoa " + id;
    }
}

