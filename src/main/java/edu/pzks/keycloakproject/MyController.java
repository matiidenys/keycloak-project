package edu.pzks.keycloakproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello/")
public class MyController {
    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("/unknown")
    public String helloUnknown() {
        return "Hello Unknown";
    }
}
