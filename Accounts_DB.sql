use bank_database;
Select * from accounts; 
INSERT INTO accounts VALUES (1234,"marshal","1234567890","mar123",100);
INSERT INTO accounts VALUES (9876,"nikhil","2135498756","nik123",2500);
Describe accounts;

DELETE FROM accounts WHERE Account_ID=9877;