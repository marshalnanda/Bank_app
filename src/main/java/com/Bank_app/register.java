package com.Bank_app;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/register")
public class register extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException{
        System.out.println("register works");
        super.init(config);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", "");
        req.setAttribute("AccountID", "");
        RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
        rd.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("uname");
        String phoneNumber=req.getParameter("phoneNumber");
        String password=req.getParameter("password");
        User user=new User(name,phoneNumber,password);
        boolean pass= DBMain.insertIntoDB(user);
        System.out.println(pass);
        if(pass) {
            req.setAttribute("message", "User Registered");
            /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }*/
            req.setAttribute("AccountID", "Dear "+name+" your account ID is: "+DBMain.showID(name,password));
            System.out.println(DBMain.showID(name,password));
        }else{
            req.setAttribute("message", "Failed!!!");
        }
        RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
        rd.forward(req,resp);
    }
}

