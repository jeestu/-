package software.lsq;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;




@ContextConfiguration(locations = { "classpath:applicationContextTest-service.xml" })
public class UserimplTest extends AbstractJUnit4SpringContextTests{

	User user;
	@Autowired
	public void setUserManager(User userManager) {
		this.user = userManager;
	}
	@Test
	public void test() {
		String expected = "Helloworld";
		String result = this.user.Hello("world");
		assertEquals(expected, result);
	}

}