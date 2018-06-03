package org.abhijit.loginapp;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
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
