package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

//    User show(int id);

    void save (User user);

    void update(int id, User updateUser);

    void delete(int id);
}