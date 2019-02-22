package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.AdminDao;
import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin get(String username) {
        return adminDao.get(username);
    }

    public List<Admin> getAll() {
        return adminDao.getAll();
    }

    public boolean login(String username, String password) {
        if (username == null || username.equals("")) {
            return false;
        }
        Admin admin = adminDao.get(username);
        if (admin == null) return false;
        if (admin.getPassword().equals(password)) return true;

        System.out.println("");
        return false;


    }

}
