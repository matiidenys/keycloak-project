package edu.pzks.keycloakproject;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello/")
public class MyController {
    @GetMapping("/user")
    @PreAuthorize("hasRole('client_user')")
    public String helloUser() {
        return " <h1>hello user<h1>";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String helloAdmin() {
        return "hello admin";
    }

    @GetMapping("/unknown")
    public String helloUnknown() {
        return "hello unknown";
    }

}
