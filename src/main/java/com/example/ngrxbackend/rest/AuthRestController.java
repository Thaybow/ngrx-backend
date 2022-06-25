package com.example.ngrxbackend.rest;

import com.example.ngrxbackend.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AuthRestController {

    @PostMapping("/api/auth")
    public UserDto attemptAuth(@RequestBody UserDto userdto) {

        if (Objects.equals(userdto.password, "te")
        ||
        Objects.equals(userdto.password, "test")
        ) {
            return userdto;
        }
        throw new RuntimeException();
    }
}
