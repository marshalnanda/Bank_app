package com.Bank_app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


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
        if(DBMain.showID(DBMain.showName(login.id,login.password),login.password)!=-1){
            //DBMain.deleteUser(login.id);
            req.setAttribute("name",DBMain.showName(login.id,login.password));
            req.setAttribute("id",login.id);
            Random random = new Random();
            int reqID = random.nextInt(100000);
            if(!DBMain.checkUserRequestInAdminDB(login.id,"Delete user")) {
                req.setAttribute("message1", "Your request for deleting account is sent to Bank");
                req.setAttribute("message2", "Your request ID is: " + reqID);
                DBMain.sendDeleteRequestToAdmin(login.id, reqID);
            }else {
                req.setAttribute("message1", "Your request is being processed");
                req.setAttribute("message2", "Your request ID is: " + DBMain.showReqID(login.id,"Delete user"));
            }
        }else{
            req.setAttribute("message1", "No user exists");
            req.setAttribute("message2", "please try again after closing this window");
        }
        RequestDispatcher rd=req.getRequestDispatcher("unRegister.jsp");
        rd.forward(req,resp);
    }

}
