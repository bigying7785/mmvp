package com.company.contorller.servlet;

import com.company.comm.Const;
import com.company.dao.entity.Emp;
import com.company.service.Impl.LoginServiceImpl;
import com.company.service.Iservise.LoginService;
import com.company.service.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindByPageServlet",urlPatterns = "/selectall")
public class FindByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            Integer page = Integer.parseInt(request.getParameter("page"));
//            Integer size = Integer.parseInt(request.getParameter("size"));
            List<Emp> byPage = new LoginServiceImpl().findByPage(0, 9);
            request.setAttribute("byPage",byPage);
            request.getRequestDispatcher("/success.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
