package com.mark.java.dao.impl;

import com.mark.java.dao.UserDao;
import com.mark.java.entity.User;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;
    public int save(User u) {
        //save是插入数据
        return (Integer)sessionFactory.getCurrentSession().save(u);
    }

    public List<User> findAll() {
        //对User类创建Criteria对象进行操作，criteria.list()拿出所有对象
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        return criteria.list();
    }
}
