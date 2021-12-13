package com.company.contorller.servlet;

import com.company.comm.Const;
import com.company.dao.entity.Emp;
import com.company.dao.entity.Tuser;
import com.company.service.Impl.LoginServiceImpl;
import com.company.service.Iservise.LoginService;
import com.company.service.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "findEmpnoServlet",urlPatterns = "/empnoselect")
public class findEmpnoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         int empno =Integer.parseInt(request.getParameter("empno")) ;
         LoginServiceImpl loginService= (LoginServiceImpl) ServiceFactory.getInstance(Const.LOGIN);
         Emp byempno = loginService.findByempno(empno);
        System.out.println(byempno);
        List<Emp> emps = new ArrayList<>();
        emps.add(byempno);
         request.setAttribute("byPage",emps);
         request.getRequestDispatcher("/success.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
