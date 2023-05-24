/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logic;

import com.mycompany.login.persistence.ControllerPersistence;
import java.util.List;


public class Controller {

    ControllerPersistence controllerPers = new ControllerPersistence();

    public String ValidateUser(String Username, String Userpass) {
       
        String messege = "";
        List<User> listUsers = controllerPers.getUsers();
        
        for( User user : listUsers){
            
            if (user.getUsername().equals(Username)){
                
                if (user.getPassword().equals(Userpass)) messege = "user successfully validated";
                else messege = "incorrect password";
            }else messege = "user not found";
        }
       return messege;
    }
    
    

}
