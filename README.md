# Spring-Security-V1

1. DDL 설정
```
CREATE USER 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
CREATE DATABASE security;
use security;
```

3. Mustache 설정(WebMvcConfig.java, IndexController)
- WebMvcConfigurer 구현하여 Mustache 설정
- IndexController 구현하여 화면 출력

5. 
