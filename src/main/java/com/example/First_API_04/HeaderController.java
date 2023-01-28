package com.example.First_API_04;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String getHostParam(@RequestHeader (name = "host")String host){
        return host;
    }
}
