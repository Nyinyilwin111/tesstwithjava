package com.spring.reposity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;

@Transactional
@Repository
public class UserRepo {

    @PersistenceContext
    private EntityManager em;

    // Insert user
    public int insertUser(User obj) {
        em.persist(obj);
        em.flush();
        return obj.getId();
    }

    // Fetch all users
    public List<User> getAllUsers() {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        return query.getResultList();
    }
}
