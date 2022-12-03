package com.Bank_app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@WebServlet("/admin")
public class admin extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Queue<String> allData= DBMain.showAllDataFromAdminDB();
        req.setAttribute("data",allData);

        int idToDelete= Integer.parseInt(req.getParameter("idToDelete"));
        if(DBMain.deleteUser(idToDelete)){
            allData= DBMain.showAllDataFromAdminDB();
            req.setAttribute("data",allData);
            req.setAttribute("Message","User Deleted");
        }else{
            req.setAttribute("Message","Delete Failed!!!");
        }
        RequestDispatcher rd=req.getRequestDispatcher("admin.jsp");
        rd.forward(req,resp);
    }

}
