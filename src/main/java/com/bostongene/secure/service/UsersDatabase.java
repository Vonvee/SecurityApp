package com.bostongene.secure.service;

import com.bostongene.secure.entity.User;

import java.util.HashMap;


public interface UsersDatabase {

    HashMap<String, String> dataBase = new HashMap<String, String>();

    void AddUser(String login, String password);

    void FindUser(String findUser);

    void DeleteUser(String toDeleteUser);
}
