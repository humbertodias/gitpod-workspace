package com.example.posts.service;

import com.example.posts.domain.User;
import com.example.posts.dto.UserDTO;
import com.example.posts.exception.InvalidRequest;
import com.example.posts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User create(UserDTO userDTO) throws InvalidRequest {
        var foundUser = userRepository.findByName(userDTO.getNome());

        // validaçao
        if(!userDTO.getEmail().contains("@")) throw new InvalidRequest("Email inválido");
        if(foundUser != null) throw new InvalidRequest("Nome " + userDTO.getNome() + " já cadastrado");

        return userRepository.insert(userDTO.toEntity());
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public void delete(String id){
        userRepository.deleteById(id);
    }

    public User update(UserDTO userDTO){
        // TODO
//        var found = userRepository.findByName(userDTO.getNome());
//        return userRepository.save(userDTO.toEntity());
        return new User();
    }

}
