package com.cos.security1.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.security1.model.User;

// 시큐리티가 /login 주소 요청이 오면 낚아채서 로그인을 진행시킨다.
// 로그인을 진행이 완료가 시큐리티 되면 session을 만들어줍니다. (Security ContextHolder)
// 오브젝트 타입 => Authentication 타입의 객체
// Authentication 안에 User 정보가 있어야 됨.
// User Object의 타입은 => UserDetails 타입 객체여야 한다.

// 쉽게 말해서, Security Session 영역이 있는데 여기 들어갈 수 있는 객체가 Authentication이다.

public class PrincipalDetails implements UserDetails {

	private User user;	// 포지션
	
	public PrincipalDetails(User user) {
		this.user = user;
	}
	
	// 해당 User의 권한을 리턴하는 곳!!
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collect = new ArrayList<>();
		collect.add(new GrantedAuthority() {
			
			@Override
			public String getAuthority() {
				return user.getRole();
			}
		});
		return collect;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		// 사용 예) 우리 사이트!! 1년동안 회원이 로그인 안하면!! 휴면 계정으로 하기로 함.
			
		// 현재시간 - 로긴시간 => 1년을 초과하면 return false;
		
		return true;
	}
}
