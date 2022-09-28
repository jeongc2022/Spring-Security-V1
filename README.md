# Spring-Security-V1

### 1. DDL 설정
```
CREATE USER 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
CREATE DATABASE security;
use security;
```
### 2. 환경설정
  - Spring Security 의존성을 설정하면 우리가 사용하는 모든 주소가 바뀌어 인증을 거쳐야 하게 됨
  
  ```
  http://localhost:8081/login
  http://localhost:8081/logout
  ```

### 3. 화면 구현 (View 설정)

3-1. Mustache 설정(WebMvcConfig.java, IndexController)
  - WebMvcConfigurer 구현하여 Mustache 설정
- IndexController 구현하여 view page 리턴, 각 함수에 @ResponseBody 추가
- Index.html ,리턴 값

### 4. 스프링 시큐리티 설정
 - SecurityConfig.java 생성 후 설정

4-1. SecurityConfig 생성 (WebSecurityConfigurerAdapter 상속)
4-2. 시큐리티 
