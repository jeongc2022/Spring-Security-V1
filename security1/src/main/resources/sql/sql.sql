CREATE USER 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
CREATE DATABASE security;
USE security;

DESC user;

UPDATE user SET role = 'ROLE_MANAGER' WHERE id = 2; 
UPDATE user SET role = 'ROLE_ADMIN' WHERE id = 3; 
COMMIT;
