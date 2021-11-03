package CRUD.service;

import CRUD.Model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
    User getId(int id);

}
