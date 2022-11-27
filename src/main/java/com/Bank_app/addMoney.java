package com.Bank_app;

import com.mysql.cj.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/addMoney")
public class addMoney extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("accountID",login.id);
        req.setAttribute("name",DBMain.showName(login.id,login.password));
        req.setAttribute("phoneNumber",DBMain.showPhoneNumber(login.id,login.password));
        req.setAttribute("balance",DBMain.showBalance(login.id,login.password));
        RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
        rd.forward(req,resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("accountID",login.id);
        req.setAttribute("name",DBMain.showName(login.id,login.password));
        req.setAttribute("phoneNumber",DBMain.showPhoneNumber(login.id,login.password));

        int idFromAddMoneyPage= Integer.parseInt(req.getParameter("idFromAddMoneyPage"));
        String passwordFromAddMoneyPage=req.getParameter("passwordFromAddMoneyPage");
        int addMoney= Integer.parseInt(req.getParameter("addMoney"));
        RequestDispatcher rd ;
        if(login.id==idFromAddMoneyPage) {
            int balanceFromDB = DBMain.showBalance(idFromAddMoneyPage, passwordFromAddMoneyPage);
            int newBalance = addMoney + balanceFromDB;
            DBMain.updateBalance(newBalance, idFromAddMoneyPage);
            req.setAttribute("balance",DBMain.showBalance(login.id,login.password));

            req.setAttribute("message1", "Balance Updated");
            rd = req.getRequestDispatcher("addMoney.jsp");
        }else{
            req.setAttribute("message1", "User Id mismatched");
            rd = req.getRequestDispatcher("addMoney.jsp");
        }
        rd.forward(req,resp);
    }
}
