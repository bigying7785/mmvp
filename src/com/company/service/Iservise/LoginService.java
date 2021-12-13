package com.company.service.Iservise;

import com.company.dao.entity.Emp;
import com.company.dao.entity.Tuser;

import java.util.List;

public interface LoginService {
    boolean go(String username, String password);
    Tuser findByid(int id);
    public List<Emp> findByPage(Integer begin, Integer size);
    Emp findByempno(Integer emono);
}
