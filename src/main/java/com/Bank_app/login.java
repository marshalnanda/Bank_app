package com.Bank_app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException{
        System.out.println("Login works");
        super.init(config);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ErrorMessage", "");
        req.setAttribute("RegistrationMessage", "");
        String name=req.getParameter("uname");
        String password=req.getParameter("password");
        req.setAttribute("name",name);
        if(name.equals("marshal") && password.equals("123")){
            RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
            rd.forward(req,resp);
        }else{
            req.setAttribute("ErrorMessage", "Not a Valid User");
            req.setAttribute("RegistrationMessage", "New user needs to register first");
            RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
            rd.forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ErrorMessage", "");
        req.setAttribute("RegistrationMessage", "");
    }


}
