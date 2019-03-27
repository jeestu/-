package edu.zut.cs.software.admin.service.lmpl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.zut.cs.software.admin.entity.User;
import edu.zut.cs.software.admin.service.UserManager;

@Service("userManager")
public class UserManagerlmpl implements UserManager {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return  "Hello,"+name+"!";
	}
	public List<User>getAll()
	{
		return null;
	}

}
