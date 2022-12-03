
CREATE TABLE `admin` (
  `Account_ID` int NOT NULL,
   `Request_ID` int NOT NULL,
  `Request_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Account_ID`),
  UNIQUE KEY `Request_ID_UNIQUE` (`Request_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

Select * from admin;
Select Account_ID,Request_ID,Request_Type from admin;
INSERT INTO admin VALUES (991,22342,'Delete user');


DELETE FROM admin WHERE Account_ID=9937;
Select * from admin;

Select Request_ID from admin WHERE Account_ID=9937 AND Request_Type='Delete user';