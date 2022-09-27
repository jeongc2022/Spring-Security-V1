# Spring-Security-V1

1. DDL 설정
```
CREATE USER 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
CREATE DATABASE security;
use security;
```
2. 환경설정
  - Spring Security 의존성을 설정하면 우리가 사용하는 모든 주소가 바뀌어 인증을 거쳐야 하게 됨

3. 화면 구현 (View 설정)

3-1. Mustache 설정(WebMvcConfig.java, IndexController)
- WebMvcConfigurer 구현하여 Mustache 설정
- IndexController 
- Index.html 로 화면 출력
