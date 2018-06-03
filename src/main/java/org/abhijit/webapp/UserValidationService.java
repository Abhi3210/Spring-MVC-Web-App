package org.abhijit.webapp;

public class UserValidationService {
         public boolean isUserValid(String user,String password)
         {
        	 if(user.equals("Abhijit")&&password.equals("12345"))
        	 {
        		 return true;
        	 }
        	 else
        		 return false;
         }
}
