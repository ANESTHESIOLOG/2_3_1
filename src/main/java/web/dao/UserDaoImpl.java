package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;

//    @Autowired
//    public UserDaoImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

//    public User show(int id) {
//        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
//    }


    public void update(int id, User updateUser) {
//        User userToBeUpdated = show(id);
//        userToBeUpdated.setFirstName(updateUser.getFirstName());
//        userToBeUpdated.setLastName(updateUser.getLastName());
//        userToBeUpdated.setEmail(updateUser.getEmail());
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    public void delete(int id) {
        //users.removeIf(p -> p.getId() == id);
    }
}