DROP TABLE BODYLOG; 
DROP SEQUENCE LOG_SEQ; 

CREATE SEQUENCE LOG_SEQ; 

CREATE TABLE BODYLOG(
	LOG_SEQ NUMBER PRIMARY KEY,
	MEMBER_NUM NUMBER NOT NULL, 
	LOG_CONTENT VARCHAR2(4000) NOT NULL, 
	LOG_IMG VARCHAR2(4000), 
	LOG_STARTDAY VARCHAR2(1000) NOT NULL, 
	LOG_ENDDAY VARCHAR2(1000) NOT NULL

	--CONSTRAINT BODYLOG_FK FOREIGN KEY(MEMBER_NUM) REFERENCES MEMBER(MEMBER_NUM) ON DELETE CASCADE ENABLE
);

INSERT INTO BODYLOG
VALUES(LOG_SEQ.NEXTVAL,1000,'오늘은 진짜 배고픈 하루다... 한끼밖에 못먹었어...다이어트 화이이이팅',NULL,'2021-06-01T00:00:00','2021-06-01T00:00:00');

SELECT * FROM BODYLOG
ORDER BY LOG_SEQ DESC;