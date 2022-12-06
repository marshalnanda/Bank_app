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

Description: Here in doGet methods will simply redirect the page to index page


JSP ,HTML & their corresponding CSS files with code Explanation

1.	index.html /.css
 
![image](https://user-images.githubusercontent.com/42877579/205895914-d99bbaf2-c5e6-4489-9d41-890c674ad993.png)
![image](https://user-images.githubusercontent.com/42877579/205897557-120cf37a-6ba3-42b4-b806-f478745fc9c6.png)
  

2.	register.jsp /.css
 
![image](https://user-images.githubusercontent.com/42877579/205941891-22ef549e-c47a-4cf1-a582-f0d03991d830.png)
![image](https://user-images.githubusercontent.com/42877579/205942057-954c2859-6c8e-4e47-874a-6228d962db62.png)

3.	Home.jsp /.css

![image](https://user-images.githubusercontent.com/42877579/205942337-879e4393-0e02-42db-8ff6-df19bb9f7ca4.png)
![image](https://user-images.githubusercontent.com/42877579/205942486-21ddc499-c853-4071-b6c4-9965cc9f49e5.png)


4.	addMoney.jsp /.css

![image](https://user-images.githubusercontent.com/42877579/205942683-c2b316e5-2bea-4ba3-ba02-079dbad35640.png)
![image](https://user-images.githubusercontent.com/42877579/205942792-f1a00a22-c610-4d27-9fb0-4e4d5955f89d.png)


5.	withdrawMoney.jsp /.css

![image](https://user-images.githubusercontent.com/42877579/205942869-55dab8ca-1d3f-4dfd-a4bd-b7537b791b54.png)
![image](https://user-images.githubusercontent.com/42877579/205942979-dcf49ed0-9d39-4487-b7b2-b3107414bbfd.png)


6.	unRegister.jsp /.css

 ![image](https://user-images.githubusercontent.com/42877579/205943283-0c4aaa77-74d9-4246-9828-045dba4c411f.png)
 ![image](https://user-images.githubusercontent.com/42877579/205943390-cdfe576b-77e7-460c-b1ac-fef884694ccb.png)



7.	admin.jsp /.css
 
 
![image](https://user-images.githubusercontent.com/42877579/205943747-93650300-5ecf-4311-9c87-74f19a7f81a4.png)
![image](https://user-images.githubusercontent.com/42877579/205943846-bfdd4890-7def-4435-9f6a-f63305c3f02f.png)

8.	notValidUser.jsp /.css
 
![image](https://user-images.githubusercontent.com/42877579/205943950-ece04632-affe-4e10-9f03-3904982e749c.png)


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
 

![image](https://user-images.githubusercontent.com/42877579/205944029-a266da1d-2713-4cca-9f78-394aeab1c1a2.png)



2.	admin table

	CREATE TABLE `admin` (
  `Account_ID` int NOT NULL,
   `Request_ID` int NOT NULL,
  `Request_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Account_ID`),
  UNIQUE KEY `Request_ID_UNIQUE` (`Request_ID`)
) 
 
![image](https://user-images.githubusercontent.com/42877579/205944088-a5d4ca13-762e-4978-a9e9-b6fed708c656.png)



