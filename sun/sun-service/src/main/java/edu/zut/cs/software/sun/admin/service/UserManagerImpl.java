package edu.zut.cs.software.sun.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.zut.cs.software.sun.admin.entity.User;



@Service("userManager")
public class UserManagerImpl implements UserManager {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String result="hello,"+name+"!";
		return result;
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
