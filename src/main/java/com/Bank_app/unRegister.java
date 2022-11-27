package com.Bank_app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/unRegister")
public class unRegister extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("name", login.name);
        //req.setAttribute("id", DBMain.showID(login.name, login.password));
        //System.out.println(login.name);
        //System.out.println(login.password);
        RequestDispatcher rd=req.getRequestDispatcher("unRegister.jsp");
        rd.forward(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post works");
        if(DBMain.showID(DBMain.showName(login.id,login.password),login.password)!=-1 && DBMain.deleteUser(login.id)){
            System.out.println("User deleted");
            req.setAttribute("message1", "User deleted");
            req.setAttribute("message2", "Now you can close this window");
        }else{
            req.setAttribute("message1", "No user exists");
            req.setAttribute("message2", "please try again after closing this window");
        }
        RequestDispatcher rd=req.getRequestDispatcher("unRegister.jsp");
        rd.forward(req,resp);
    }

}
