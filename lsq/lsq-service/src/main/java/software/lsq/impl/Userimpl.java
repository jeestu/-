package software.lsq.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import software.lsq.entity.Use;
import software.lsq.User;

@Service("user")
public  class Userimpl implements User {

	@Override
	public String Hello(String name) {
		String result="Hello"+name;
		return result;
	}
	
	@Override
	public List<Use> getAll(){
		return null;
		
	}
}
