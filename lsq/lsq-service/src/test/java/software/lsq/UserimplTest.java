package software.lsq;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import software.lsq.entity.Use;

@ContextConfiguration(locations = { "classpath:applicationContextTest-service.xml" })
public class UserimplTest extends AbstractJUnit4SpringContextTests{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(UserimplTest.class.getName());

	User user;
	
	@Autowired
	void setUserManager(User userManager) {
		this.user = userManager;
	}
	@Test
	public void testsayHello() {
		String expected = "Helloworld";
		String result = this.user.Hello("world");
		if (logger.isDebugEnabled()) {
			logger.debug("test() - start"); //$NON-NLS-1$
		}
		assertEquals(expected, result);
	}
	@Test
	public void testGetAll() {
		List<Use> all = this.user.getAll();
        //assertNotNull(all);
		if (logger.isInfoEnabled()) {
			logger.info("testGetAll() - List<User> all={}", all); //$NON-NLS-1$
		}
		
	}

}