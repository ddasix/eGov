DROP SEQUENCE EMPSEQUENCE;
DROP TABLE USERS;
CREATE TABLE USERS ( 
	USER_ID VARCHAR2(20) NOT NULL,
	USER_NAME VARCHAR2(50) NOT NULL,
	PASSWORD VARCHAR2(10) NOT NULL,
	ROLE VARCHAR2(5),
	SSN VARCHAR2(13),
	SL_YN CHAR(1),
	BIRTH_DAY VARCHAR2(8),
	AGE NUMBER(3),
	CELL_PHONE VARCHAR2(14),
	ADDR VARCHAR2(100),
	EMAIL VARCHAR2(50),
	EMAIL_YN CHAR(1),
	IMAGE_FILE VARCHAR2(100),
	REG_DATE DATE
);
ALTER TABLE USERS ADD CONSTRAINT PK_USERS PRIMARY KEY (USER_ID);

INSERT INTO USERS ( USER_ID, USER_NAME, PASSWORD, ROLE, SSN, SL_YN, BIRTH_DAY, AGE, CELL_PHONE, ADDR, EMAIL, EMAIL_YN, IMAGE_FILE, REG_DATE ) 
           VALUES ( 'kd.hong', 'ȫ�浿', 'test123', 'user', NULL, 'Y', '19880604', 22, '010-1234-4491', '��⵵ ������ �д籸 ���̵�', 'kd.hong@gmail.com', 'Y', 'EMP-USER-00012.jpg',  TO_Date( '03/10/2008 02:40:48 ����', 'MM/DD/YYYY HH:MI:SS AM')); 
INSERT INTO USERS ( USER_ID, USER_NAME, PASSWORD, ROLE, SSN, SL_YN, BIRTH_DAY, AGE, CELL_PHONE, ADDR, EMAIL, EMAIL_YN, IMAGE_FILE, REG_DATE ) 
           VALUES ( 'any.lee', '�ִ̾�', 'test123', 'user', NULL, 'Y', NULL, NULL, NULL, NULL, 'any.lee@dreamwiz.com', 'Y', 'EMP-USER-00015.jpg',  TO_Date( '03/10/2008 03:10:52 ����', 'MM/DD/YYYY HH:MI:SS AM')); 
INSERT INTO USERS ( USER_ID, USER_NAME, PASSWORD, ROLE, SSN, SL_YN, BIRTH_DAY, AGE, CELL_PHONE, ADDR, EMAIL, EMAIL_YN, IMAGE_FILE, REG_DATE ) 
           VALUES ( 'test', 'test', 'test123', 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL); 


DROP TABLE BOARD;

CREATE TABLE BOARD(
	BOARDNO VARCHAR2(13) PRIMARY KEY,
	TITLE VARCHAR2(100),
	WRITER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REGDATE DATE DEFAULT SYSDATE,
	CNT NUMBER(5) DEFAULT 0
);

INSERT INTO BOARD(BOARDNO, TITLE, WRITER, CONTENT) 
VALUES('BOARD-00001', 'ó�� �ø��� ��', 'test', '�� ��Ź�帳�ϴ�.');

commit;

