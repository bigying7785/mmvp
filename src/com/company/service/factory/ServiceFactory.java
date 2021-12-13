package com.company.service.factory;

import com.company.contorller.servlet.LoginServlet;
import com.company.dao.impl.LoginDaoImpl;
import com.company.service.Impl.LoginServiceImpl;
import com.company.service.Iservise.LoginService;

public class ServiceFactory {
    public static Object getInstance(String name){
        switch (name){
            case"LOGIN":
                return new LoginServiceImpl();
            case "LOGINER":
                return new LoginDaoImpl();
        }
        return null;
    }

}
