package org.abhijit.loginapp;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@SessionAttributes("name")
public class LoginController {
	
	/*@Autowired
	LoginService loginservice;*/
	@RequestMapping(value="/",method=RequestMethod.GET)
	//@ResponseBody
       public String showLoginPage(ModelMap model)
       {   
		   model.put("name", getLoggedInUserName());
    	  // return "login";
		   return "welcome";
       }
	  public String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}
	
	/*@RequestMapping(value="/validation",method=RequestMethod.POST)
	
       public String handleLoginRequest(@RequestParam String name,
    		   @RequestParam String password,ModelMap model )
       {   
		 if(!loginservice.isUserValid(name, password))
		 { 
		   model.put("errormessage","Invalid Credentials !!!!");
		   return "login";
		 }
		  model.put("name",name);
		 //model.put("password",password);
    	  return "welcome";
       }*/
}
