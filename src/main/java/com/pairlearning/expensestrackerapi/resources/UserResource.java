package com.pairlearning.expensestrackerapi.resources;

import com.pairlearning.expensestrackerapi.domain.User;
import com.pairlearning.expensestrackerapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    //response entity is extended entity of http entity
    public ResponseEntity<Map<String,String>> registerUser(@RequestBody Map<String,Object> userMap){
    String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        User user = userService.registerUser(firstName, lastName, email, password);
        Map<String, String> map = new HashMap<>();
        map.put("message","registerd sussesfully");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
