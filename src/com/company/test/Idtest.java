package com.company.test;

import com.company.dao.entity.Emp;
import com.company.dao.entity.Tuser;
import com.company.dao.idao.LoginDao;
import com.company.dao.impl.LoginDaoImpl;
import com.company.service.Impl.LoginServiceImpl;
import com.company.service.Iservise.LoginService;
import org.junit.Test;

import java.util.List;

public class Idtest {

    @Test
    public void test01() throws Exception {
         LoginDao loginDao = new LoginDaoImpl();
         Tuser byid = loginDao.findByid(1);
        System.out.println(byid);
    }
    @Test
    public void test02() throws Exception{
        List<Emp> byPage = new LoginServiceImpl().findByPage(0, 8);
        for (Emp emp : byPage) {
            System.out.println(emp);
        }



    }
}
