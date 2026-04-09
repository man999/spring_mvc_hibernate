package org.spring.mvc.hibernate.entity.dao;

import org.hibernate.Session;
//import com.mysql.cj.xdevapi.Session;
//import com.mysql.cj.xdevapi.SessionFactory;
import jakarta.transaction.Transactional;
import org.spring.mvc.hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
//    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
//        Session session = sessionFactory.getSession();
//        return List.of();
        return null;
    }
}
