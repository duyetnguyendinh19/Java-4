
CREATE DATABASE test;
USE test;
GO

CREATE TABLE KHACHHANG(
	MaKhachHang VARCHAR(50) NOT NULL,
	MatKhau	VARCHAR(50) NULL,
	HoVaTen	VARCHAR(50) NULL,
	Email	VARCHAR(50) NULL,
	DienThoai	VARCHAR(50) NULL,
	PRIMARY KEY (MaKhachHang)
)

INSERT INTO KHACHHANG VALUES('KH01','123','Nguyen Van Teo', 'teonv@gmail.com','0123456789')
INSERT INTO KHACHHANG VALUES('KH02','123','Le Van Tam', 'tamlv@gmail.com','0123456789')
INSERT INTO KHACHHANG VALUES('KH03','123','Phan Van Bi', 'bipv@gmail.com','0123456789')
INSERT INTO KHACHHANG VALUES('KH04','123','Le Van Phung', 'phunglv@gmail.com','0123456789')

SELECT * FROM KHACHHANG;

CREATE TABLE tblEmp(
	userID INT NOT NULL,
	Name VARCHAR(50) NULL,
	PRIMARY KEY (userID)
)

INSERT INTO tblEmp VALUES(1,'Cu')
INSERT INTO tblEmp VALUES(2,'Teo')
INSERT INTO tblEmp VALUES(3,'Ti')
INSERT INTO tblEmp VALUES(4,'Bi')

CREATE TABLE tblEmpAddr(
	addr_ID INT NOT NULL,
	addrName VARCHAR(50) NULL,
	phoneNo VARCHAR(50) NULL,
	user_ID INT NOT NULL,
	PRIMARY KEY (addr_ID),
	FOREIGN KEY (user_ID) REFERENCES tblEmp (userID)
)

INSERT INTO tblEmpAddr (addr_ID,addrName,phoneNo,user_ID) VALUES (1,'Da Nang','0123456789',2)
INSERT INTO tblEmpAddr (addr_ID,addrName,phoneNo,user_ID) VALUES (2,'Tay Nguyen','0123456788',1)
INSERT INTO tblEmpAddr (addr_ID,addrName,phoneNo,user_ID) VALUES (3,'Ho Chi Minh','0123456787',3)
INSERT INTO tblEmpAddr (addr_ID,addrName,phoneNo,user_ID) VALUES (4,'Khanh Hoa','0123456786',4)
INSERT INTO tblEmpAddr (addr_ID,addrName,phoneNo,user_ID) VALUES (5,'Ha Noi','0123456785',4)