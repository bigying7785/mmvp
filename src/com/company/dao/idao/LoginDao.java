package com.company.dao.idao;

import com.company.dao.entity.Emp;
import com.company.dao.entity.Tuser;

import java.util.List;

public interface LoginDao {
    Tuser finduser(String username, String password) throws Exception;
    Tuser findByid(int id) throws Exception;
    public List<Emp> findByPage(int begin,int size) throws Exception;
    Emp findByempno(Integer emono) throws Exception;
    Emp delete(Emp emp) throws Exception;

}
