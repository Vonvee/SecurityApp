package com.bostongene.secure.service;

import com.bostongene.secure.entity.User;

import java.io.Serializable;

public class UsersDatabaseImpl implements UsersDatabase, Serializable {
    public UsersDatabaseImpl() {
    }

    public void AddUser(String login, String password) {
        dataBase.put(login, password);
    }

    public void FindUser(String userName) {
        dataBase.get(userName);
    }

    public void DeleteUser(String toDeleteUser) {
        dataBase.remove(toDeleteUser);
    }


    public void DeleteUser(User toDeleteUser) {
        dataBase.remove(toDeleteUser.getLogin());
    }
}
