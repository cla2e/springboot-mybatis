package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin get(String username);

    List<Admin> getAll();

    boolean login(String username, String password);
}
