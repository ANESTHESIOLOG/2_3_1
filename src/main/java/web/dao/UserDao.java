package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    User getUser(int id);

    void saveUser (User user);

    void updateUser(int id, User updateUser);

    void deleteUser(int id);
}