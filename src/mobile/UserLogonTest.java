package mobile;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLogonTest {

	@Test
	public void testValidateUser() {
				
		UserLogon user= new UserLogon();
		
		
		// User ID and Password must be the same for successful login 
		assertTrue("User ID and password must be the same", user.isValidAccount("bob", "bob"));
		assertFalse("User ID and password must be the same - case sensitive", user.isValidAccount("bob", "BOB"));
		assertFalse("User ID and password must be the same", user.isValidAccount("bob", "tanuj"));
		
		// Login fails if max login attempts reached
		assertFalse("Max login attempts is 3", user.isMaxAttemptsReached(1));
		assertFalse("Max login attempts is 3", user.isMaxAttemptsReached(2));
		assertFalse("Max login attempts is 3", user.isMaxAttemptsReached(3));
		assertTrue("Max login attempts is 3", user.isMaxAttemptsReached(4));
		
		
	}

}