package com.Bank_app;
//assdfkhhhgkjdf
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
    static int id;
    static String password;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id= Integer.parseInt(req.getParameter("id"));
        password=req.getParameter("password");

        req.setAttribute("accountID",id);
        req.setAttribute("name",DBMain.showName(id,password));
        req.setAttribute("phoneNumber",DBMain.showPhoneNumber(id,password));
        req.setAttribute("balance",DBMain.showBalance(id,password));

        RequestDispatcher rd;
        System.out.println("User validate: "+DBMain.checkUserValidation(id,password));

        if(DBMain.checkUserValidation(id,password)){
            rd = req.getRequestDispatcher("Home.jsp");
        }else{
            rd = req.getRequestDispatcher("Error/notValidUser.jsp");
        }
        rd.forward(req,resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String formResponse=req.getParameter("formRequest");
        System.out.println(formResponse);

        switch (formResponse) {
            case "Delete Account": {
                req.setAttribute("name", DBMain.showName(id,password));
                req.setAttribute("id", id);
                req.setAttribute("message1", "");
                req.setAttribute("message2", "");
                RequestDispatcher rd = req.getRequestDispatcher("unRegister.jsp");
                rd.forward(req, resp);
                break;
            }
            case "Withdraw Money": {
                req.setAttribute("message1", "");
                RequestDispatcher rd = req.getRequestDispatcher("withdrawMoney.jsp");
                rd.forward(req, resp);
                break;
            }
            case "Add Money": {
                req.setAttribute("message1", "");
                RequestDispatcher rd = req.getRequestDispatcher("addMoney.jsp");
                rd.forward(req, resp);
                break;
            }
            case "Logout": {
                RequestDispatcher rd = req.getRequestDispatcher("index.html");
                rd.forward(req, resp);
                break;
            }
        }

    }


}
