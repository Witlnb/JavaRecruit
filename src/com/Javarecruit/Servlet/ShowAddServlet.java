package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.Service.ShowService;
import com.Javarecruit.pojo.Show;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowAddServlet",urlPatterns = {"/ShowAddServlet"})
public class ShowAddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String title = request.getParameter("title");
        String show = request.getParameter("show");
        String company = request.getParameter("company");
        String companyid = request.getParameter("companyid");
        String money = request.getParameter("money");
        int i = Integer.parseInt(money);
        int parseInt = Integer.parseInt(companyid);
        Show s=new Show();
        s.setTitle(title);
        s.setInformation(show);
        s.setCompany(company);
        s.setCompanyid(parseInt);
        s.setMoney(i);
        ShowService ss=new ShowServiceImpl();
        int addrecruit = ss.addrecruit(s);
        if (addrecruit!=0){
            out.print("你好");
        }else{
            response.sendRedirect("ShowInsert.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
