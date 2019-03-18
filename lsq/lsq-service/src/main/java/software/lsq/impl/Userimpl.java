package software.lsq.impl;

import org.springframework.stereotype.Service;

import software.lsq.User;

@Service("user")
public  class Userimpl implements User {

	@Override
	public String Hello(String name) {
		String na="Hello"+name;
		return na;
	}
}
