/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.persistence;

import com.mycompany.login.logic.User;
import java.util.List;


public class ControllerPersistence {
    
    UserJpaController userJpa = new UserJpaController(); 

    
    public List<User> getUsers() {
        //SELECT * FROM 
        return userJpa.findUserEntities();
    }
    
}
