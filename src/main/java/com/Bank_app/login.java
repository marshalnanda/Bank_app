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
        String name=req.getParameter("uname");
        String password=req.getParameter("password");
        req.setAttribute("name",name);
        RequestDispatcher rd;
        System.out.println("User validate: "+DBMain.checkUserValidation(name,password));

        if(DBMain.checkUserValidation(name,password)){
            rd = req.getRequestDispatcher("Home.jsp");
        }else{
            rd = req.getRequestDispatcher("Error/notValidUser.jsp");
        }
        rd.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
