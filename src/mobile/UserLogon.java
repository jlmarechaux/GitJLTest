package mobile;

public class UserLogon {
	
	public String validateUser(int attempts, String user, String password) {
        String message="ERROR";
        boolean lockUser=true;
                
    	lockUser= this.isMaxAttemptsReached(attempts);
    	
    		if (lockUser) {
				message = "LOCK - Number of login attempts reached. Contact your administrator";
			} else {
				
				if (this.isValidAccount(user, password)) {
					message="SUCCESS";
				}
			}
    	
       	return message;
    }
	
	public boolean isMaxAttemptsReached (int attempts) {
		boolean lock=true;
		int maxAttempts=3;  // Set to 2 just to simulate an error
		
		if (attempts<=maxAttempts)  lock=false;
		
		return lock;
	}
	
	public boolean isValidAccount(String user, String password) {
		boolean validUser=false;
		
		if (user.equals(password)) validUser=true;
		
		return validUser;
	}

}