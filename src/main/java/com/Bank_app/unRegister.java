package com.Bank_app;

import javax.servlet.RequestDispatcher;
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
        System.out.println("unregister works");
        //req.setAttribute("name",name);
        RequestDispatcher rd=req.getRequestDispatcher("unRegister.jsp");
        rd.forward(req,resp);
    }
}
