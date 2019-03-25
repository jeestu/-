package edu.zut.cs.software.sun.admin.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.zut.cs.software.sun.admin.advice.Login;

public class TestLog {

	public static void main(String[] args) {
		ApplicationContext acx = new ClassPathXmlApplicationContext("log/bean.xml");
		Login login = (Login) acx.getBean("CGLIBProxyFactoryBean");//�ɴ��������ɴ������
		login.login();
	}
}
