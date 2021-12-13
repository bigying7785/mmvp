package com.company.service.Impl;

import com.company.comm.Const;
import com.company.dao.entity.Emp;
import com.company.dao.entity.Tuser;
import com.company.dao.idao.LoginDao;
import com.company.service.Iservise.LoginService;
import com.company.service.factory.ServiceFactory;
import org.junit.Test;

import java.util.List;

public class LoginServiceImpl implements LoginService {
    LoginDao empDao;

    public LoginServiceImpl() {
        empDao= (LoginDao) ServiceFactory.getInstance(Const.LOGINER);
    }

    @Override
    public boolean go(String username, String password) {
        Tuser tuser = null;
        try {
            tuser = empDao.finduser(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (tuser==null){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public Tuser findByid(int id) {
        Tuser byid=null;
        try {
             byid = empDao.findByid(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (byid!=null){
            return byid;
        }else {
            return null;
        }

    }

    @Override
    public List<Emp> findByPage(Integer begin, Integer size) {
        List<Emp> byPage=null;
        try {
            byPage = empDao.findByPage(begin, size);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byPage;
    }

    @Override
    public Emp findByempno(Integer emono) {
        Emp byempno=null;
        try {
            byempno = empDao.findByempno(emono);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byempno;
    }


}
