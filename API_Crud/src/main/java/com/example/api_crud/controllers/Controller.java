package com.example.api_crud.controllers;

import com.example.api_crud.models.UserModel;
import com.example.api_crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    private UserService userService;

   @GetMapping()
    public ArrayList<UserModel> getUsers() {
        return this.userService.getUsers();
   }

   @GetMapping(path = "/{id}")
    public Optional<UserModel> getById(@PathVariable Long id) {
        return userService.getById(id);
   }

   @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);

   }

   @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable Long id) {
        return this.userService.updateUserById(request, id);
   }

   @DeleteMapping(path = "/{id}")
   public String deleteUserById(@PathVariable Long id) {

       boolean ok = this.userService.deleteUserById(id);

       if (ok) {
           return "Usuario con el id: " + id + " ha sido borrado.";
       }else{
           return "Error al eliminar ususario.";
       }

   }




}
