package com.felippedev.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("/")
  public String list() {
    return "All users";
  }

  @PostMapping("/")
  public void create(@RequestBody UserModel user) {
    userRepository.createUser(user);
    System.out.println("Usuário criado: " + user.getName());
  }

}
