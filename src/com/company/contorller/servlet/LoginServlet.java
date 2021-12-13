package com.company.contorller.servlet;

import com.company.comm.Const;
import com.company.dao.entity.Tuser;
import com.company.service.Impl.LoginServiceImpl;
import com.company.service.Iservise.LoginService;
import com.company.service.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username=request.getParameter("username");
            String password = request.getParameter("password");
            //boolean yorn=new LoginServiceImpl().go(username,password);
        LoginService loginService = (LoginService) ServiceFactory.getInstance(Const.LOGIN);
        //返回user对象
        Boolean user = loginService.go(username, password);
        if (user){
                request.getRequestDispatcher("/success.jsp").forward(request,response);
            }else {
                request.getRequestDispatcher("/error.jsp").forward(request,response);
            }
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response );
    }
}
