package com.example.posts.controller;

import com.example.posts.domain.User;
import com.example.posts.dto.UserDTO;
import com.example.posts.exception.InvalidRequest;
import com.example.posts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity post(@RequestBody UserDTO userDTO) throws InvalidRequest {
        var inserted = userService.create(userDTO);
        return (inserted != null) ?
                ResponseEntity.status(204).build() :
                ResponseEntity.badRequest().build();

    }

    @GetMapping
    public List<User> get(){
        return userService.getAll();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable String id){
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity put(@RequestBody UserDTO userDTO){
        var updated = userService.update(userDTO);
        return (updated != null) ?
                ResponseEntity.status(200).build() :
                ResponseEntity.badRequest().build();
    }


}
