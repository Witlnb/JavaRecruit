package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.pojo.Show;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Pattern;

@WebServlet(name = "ShowMoneyServlet",urlPatterns = {"/ShowMoneyServlet"})
public class ShowMoneyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        Integer  name= Integer.parseInt(request.getParameter("iop"));
        ShowServiceImpl ssi=new ShowServiceImpl();
        List<Show> sh=ssi.money(name);
        System.out.println(name);
        session.setAttribute("iop",sh);
        if(name==0){
            request.getRequestDispatcher("Hall.jsp").forward(request,response);
        }
//        if(name== 0){
//            request.getRequestDispatcher("ShowMoney.jsp").forward(request,response);
//        }else{
//            request.getRequestDispatcher("MoneyServlet.jsp").forward(request,response);
//        }
        out.flush();
        out.close();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
