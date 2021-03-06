package com.Javarecruit.Servlet;

import com.Javarecruit.Service.ServiceImpl.HrServiceImpl;
import com.Javarecruit.Service.ServiceImpl.ShowServiceImpl;
import com.Javarecruit.pojo.Hr;
import com.Javarecruit.pojo.Show;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowReviseServlet", value = "/ShowReviseServlet")
public class ShowReviseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Integer sid = Integer.parseInt(request.getParameter("sid"));
        Integer companyid = Integer.parseInt(request.getParameter("companyid"));
        Integer money = Integer.parseInt(request.getParameter("money"));
        String title = request.getParameter("title");
        String information = request.getParameter("information");
        String company = request.getParameter("company");
        Show s = new Show();
        ShowServiceImpl ss = new ShowServiceImpl();
        s.setCompany(company);
        s.setCompanyid(companyid);
        s.setSid(sid);
        s.setInformation(information);
        s.setMoney(money);
        s.setTitle(title);
        int a = ss.revise(s);
        if(a > 0){
            response.sendRedirect("ShowHItwo.jsp");
        }else {
            response.sendRedirect("ShowRervlet.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
