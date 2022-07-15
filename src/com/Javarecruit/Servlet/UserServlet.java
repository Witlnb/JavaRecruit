package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.UserServiceImpl;
import com.Javarecruit.Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserServlet",urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        UserService us=new UserServiceImpl();
        String login = us.login(uname, upwd);
        System.out.println(login);
        if ("老板登录成功".equals(login)){
//            request.getRequestDispatcher("showMore.jsp").forward(request,response);
            out.print("老板");
        }else if ("用户登录成功".equals(login)){
            out.print("用户");
        }else{
           response.sendRedirect("UserLogin.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
