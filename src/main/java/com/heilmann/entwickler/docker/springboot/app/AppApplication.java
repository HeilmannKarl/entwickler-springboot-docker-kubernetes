package com.heilmann.entwickler.docker.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@SpringBootApplication
@RestController
public class AppApplication {

    @RequestMapping("/")
    public String index() throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        return "Hello Container World\nIP: " +ip;
    }

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
