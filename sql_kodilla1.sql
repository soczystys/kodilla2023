SHOW DATABASES;

USE KODILLA_COURSE;

CREATE TABLE ISSUESLISTS
(
	ID SERIAL PRIMARY KEY,
    NAME VARCHAR(100)
);

CREATE TABLE ISSUES
(
	ID SERIAL PRIMARY KEY,
    SUMMARY VARCHAR(100),
    DESCRIPTION VARCHAR(100),
    
    ISSUESLIST_ID BIGINT UNSIGNED NOT NULL,
    USER_ID_ASSIGNED_TO BIGINT UNSIGNED NOT NULL,
    
    FOREIGN KEY (ISSUESLIST_ID) REFERENCES ISSUESLISTS(ID),
    FOREIGN KEY (USER_ID_ASSIGNED_TO) REFERENCES USERS(ID)
);

INSERT INTO ISSUESLISTS(NAME)
VALUES  ('ToDo'),
		('In progress'),
		('Done');
        
COMMIT;


SELECT * FROM ISSUESLISTS;

INSERT INTO ISSUES (SUMMARY, DESCRIPTION, ISSUESLIST_ID, USER_ID_ASSIGNED_TO)
VALUES 
    ('Issue 1', 'Description for Issue 1', 1, 2),
    ('Issue 2', 'Description for Issue 2', 1, 3),
    ('Issue 3', 'Description for Issue 3', 2, 1),
    ('Issue 4', 'Description for Issue 4', 2, 4),
    ('Issue 5', 'Description for Issue 5', 3, 5),
    ('Issue 6', 'Description for Issue 6', 3, 3),
    ('Issue 7', 'Description for Issue 7', 1, 2),
    ('Issue 8', 'Description for Issue 8', 2, 1),
    ('Issue 9', 'Description for Issue 9', 3, 5),
    ('Issue 10', 'Description for Issue 10', 2, 4);
    
COMMIT;

SELECT * FROM ISSUES;

SELECT USER_ID, COUNT(*) AS POSTS_NUMBER
FROM POSTS
GROUP BY USER_ID
HAVING COUNT(*) > 1;

SELECT I.SUMMARY, I.DESCRIPTION, IL.NAME
FROM ISSUES I
JOIN issueslists IL ON IL.ID = I.ISSUESLIST_ID;

SELECT *
FROM ISSUES I
JOIN USERS U ON U.ID = I.USER_ID_ASSIGNED_TO;

SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS TOTAL_ISSUES
FROM USERS U
JOIN ISSUES I ON I.USER_ID_ASSIGNED_TO = U.ID
GROUP BY U.ID;

SELECT * FROM issues;