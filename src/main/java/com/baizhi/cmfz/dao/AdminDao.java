package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Admin;

import java.util.List;

public interface AdminDao {

    Admin get(String username);

    List<Admin> getAll();
}
