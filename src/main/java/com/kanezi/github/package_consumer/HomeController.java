package com.kanezi.github.package_consumer;


import com.kanezi.github.UuidTimestampGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/")
@RestController
public class HomeController {

    @GetMapping
    public String display() {
        return UuidTimestampGenerator.generate();
    }

}
