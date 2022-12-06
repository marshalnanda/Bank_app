Bank Management System

User Flow Diagram

 
![image](https://user-images.githubusercontent.com/42877579/205895679-90c02123-77e5-4b37-8dae-d949fd68eea3.png)



Technology used
1.	Java
2.	HTML
3.	CSS
4.	Servlet
5.	Server- Tomcat
6.	Git-hub Link-marshalnanda/Bank_app (github.com)










Java Classes 

1.	DBUtils.java
2.	login.java
3.	User.java
4.	admin.java
5.	register.java
6.	addMoney.java
7.	withdrawMoney.java
8.	unRegister.java
9.	DBMain.java
10.	logout.java


JSP ,HTML & their corresponding CSS files

1.	index.html /.css
2.	register.jsp /.css
3.	Home.jsp /.css
4.	addMoney.jsp /.css
5.	withdrawMoney.jsp /.css
6.	unRegister.jsp /.css
7.	admin.jsp /.css
8.	notValidUser.jsp /.css

Database Tables

Schema name - bank_database

1.	accounts
2.	admin

Java Classes 

1.	DBUtils.java

Description- Here getMysqlConnection method is created which is used to connect application to the database by setting URL,user,and password to the setURL,setUser,setPassword methods respectively of the MysqlDataSource Object

2.	login.java

Description- Here doGet method will take user credentials from index page and check for validation if given credentials matches within the database or admin credentials.If any credentials matches then the page will go to the Home page or admin page based on the credentials else it will go to the error page.

doPost method is will take input from home page and redirect to corresponding page.
like if user choose to delete button then the page will redirect to unregister page.

3.	User.java

Description-This class is used to make new user from registration page by using constructor ,getters and setters. userName,userPhoneNumber,userPassword is used to create constructor.

Note: Here userID and userBalance is not used as ID is auto incremented from the database and balance will be 0 if a user create new account.

4.	admin.java

Description: Here doPost method will take account id as input from admin page and deletes user form the accounts and admin database simultaneously.

5.	register.java

Description: Here doPost method will take user name,phone number,password from user and create an account in accounts table of the database based on those inputs and give user an account id which is auto generated from database.

6.	addMoney.java

Description: Here doPost method will take account id,password,deposit amount from user and update account balance of those credentials in accounts table of the database.

7.	withdrawMoney.java

Description: Here doPost method will take account id,password,deposit amount from user and update account balance of those credentials in accounts table of the database.
xx
8.	unRegister.java

Description: Here in doPost method if user press delete account button a delete request will be send to admin table of the database and a randomly generated request id is shown to user.

9.	DBMain.java

Description: Here are all the methods which is used to either update or taking output from the database.

10.	logout.java

Description: Here in doGet methods will simply redirect the page to index pag
JSP ,HTML & their corresponding CSS files

1.	index.html /.css
 
![image](https://user-images.githubusercontent.com/42877579/205895914-d99bbaf2-c5e6-4489-9d41-890c674ad993.png)
![image](https://user-images.githubusercontent.com/42877579/205897557-120cf37a-6ba3-42b4-b806-f478745fc9c6.png)
  

2.	register.jsp /.css
 

 



3.	Home.jsp /.css
 



 







4.	addMoney.jsp /.css
 
 







5.	withdrawMoney.jsp /.css
 
 







6.	unRegister.jsp /.css

 
 










7.	admin.jsp /.css
 
 









8.	notValidUser.jsp /.css
 



Database Tables

1.	account table

CREATE TABLE `accounts` (
  `Account_ID` int NOT NULL AUTO_INCREMENT,
  `User_Name` varchar(100) NOT NULL,
  `User_phoneNumber` varchar(15) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Balance(₹)` int DEFAULT '0',
  PRIMARY KEY (`Account_ID`),
  UNIQUE KEY `Account_ID_UNIQUE` (`Account_ID`),
  UNIQUE KEY `User_phoneNumber_UNIQUE` (`User_phoneNumber`)
) 
 




2.	admin table

	CREATE TABLE `admin` (
  `Account_ID` int NOT NULL,
   `Request_ID` int NOT NULL,
  `Request_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Account_ID`),
  UNIQUE KEY `Request_ID_UNIQUE` (`Request_ID`)
) 
 



