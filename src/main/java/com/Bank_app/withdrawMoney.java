package com.Bank_app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/withdrawMoney")
public class withdrawMoney extends HttpServlet {

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

        int idFromWithdrawMoneyPage= Integer.parseInt(req.getParameter("idFromWithdrawMoneyPage"));
        String passwordFromWithdrawMoneyPage=req.getParameter("passwordFromWithdrawMoneyPage");
        int withdrawMoney= Integer.parseInt(req.getParameter("withdrawMoney"));
        RequestDispatcher rd ;
        if(login.id==idFromWithdrawMoneyPage) {
            int balanceFromDB = DBMain.showBalance(idFromWithdrawMoneyPage, passwordFromWithdrawMoneyPage);

            int newBalance = balanceFromDB-withdrawMoney;
            if(newBalance>0) {
                DBMain.updateBalance(newBalance, idFromWithdrawMoneyPage);
                req.setAttribute("balance", DBMain.showBalance(login.id, login.password));
                req.setAttribute("message1", "Balance Updated");
            }else{
                req.setAttribute("balance", DBMain.showBalance(login.id, login.password));
                req.setAttribute("message1", "Failed Insufficient Balance !!!");
            }

        }else{
            req.setAttribute("message1", "User Id mismatched");
        }
        rd = req.getRequestDispatcher("withdrawMoney.jsp");
        rd.forward(req,resp);
    }
}
