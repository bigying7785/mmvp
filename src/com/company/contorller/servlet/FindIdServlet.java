package com.company.contorller.servlet;

import com.company.comm.Const;
import com.company.dao.entity.Tuser;
import com.company.service.Iservise.LoginService;
import com.company.service.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FindIdServlet",urlPatterns = "/byid")
public class FindIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        LoginService loginService = (LoginService) ServiceFactory.getInstance(Const.LOGIN);
        Tuser byid = loginService.findByid(id);
        if (byid!=null){
            request.setAttribute("byid",byid);
            request.getRequestDispatcher("/show_user.jsp").forward(request,response);
        }else {
            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }

    }
}
