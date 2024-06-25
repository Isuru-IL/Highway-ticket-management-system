package lk.ijse.gdse.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "User Controller";
    }
}
