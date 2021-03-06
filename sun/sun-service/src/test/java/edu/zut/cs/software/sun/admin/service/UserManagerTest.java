package edu.zut.cs.software.sun.admin.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:applicationContextTest-service.xml" })
public class UserManagerTest extends AbstractJUnit4SpringContextTests {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(UserManagerTest.class.getName());

	/**
	 * Logger for this class
	 */
	
	UserManager userManager;

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	@Test
	public void testSayHello() {
	

		String expected = "Hello, world!";
		String result = this.userManager.sayHello("world");
		assertEquals(expected, result);

		if (logger.isInfoEnabled()) {
			logger.info("testSayHello() - String result={}", result); //$NON-NLS-1$
		}
		
	}

}
