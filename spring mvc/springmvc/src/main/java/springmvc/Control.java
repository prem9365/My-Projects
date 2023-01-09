package springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.ServiceLayer;

@Controller
public class Control {
	
	@Autowired
	 private ServiceLayer serviceLayer ;
	 
	 
	@RequestMapping("/control")
	public String hope(Model m){
		
		m.addAttribute("header","Student Login Form");
		m.addAttribute("Desc","Fill it Properly");
		System.out.println("this is MVC web server");
		return "control";
			
	}
	//old Method
//	@RequestMapping(path="/processform",method=RequestMethod.POST)
//    public String formHandling(HttpServletRequest request)
//    {
//	
//		String email = request.getParameter("email");
//		
//     	System.out.println("Email is  :"+ email);
//     	
//		       return "  " ;
//		
//	 }
	
	
	
	
	// Sending data from view to controller
	
	//USING RequestParam Annotation....

	
/*	@RequestMapping(path="processform" , method=RequestMethod.POST)
 * 
	public String handle(@RequestParam ("email") String userEmail,
			@RequestParam("password") String password,
			@RequestParam("username") String name , Model model){
		
		
		System.out.println("Name..:"+ name);
		
		System.out.println("Email..:"+ userEmail);
		
		System.out.println("PassWord..:"+ password);
		
		
		//Process
		
		
		// sending data from controller to  view
		
		model.addAttribute("mail",userEmail);
		model.addAttribute("UserName",name);
		model.addAttribute("Password",password);
		
		
		return "success";
		
			
	}
		
		*/
	
	
	/*	
	
	@RequestMapping(path="processform" , method=RequestMethod.POST)
	public String handle(@RequestParam ("email") String userEmail,
			@RequestParam("password") String password,
			@RequestParam("username") String name , Model model){
		
		User use = new User();
		
		use.setEmail(userEmail);
		use.setPassword(password);
		use.setUsername(name);
		
		System.out.println(use);
		//Process
		
		
		// sending data from controller to  view
		
	/*	model.addAttribute("mail",userEmail);
		model.addAttribute("UserName",name);
		model.addAttribute("Password",password);
		
		
		
		model.addAttribute("user",use);
		
		return "success";
	
	
	}		
    */ 
	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	
	public String handling(@ModelAttribute User user 	, Model m){
		
		System.out.println(user);
		
		
		this.serviceLayer.createUser(user);
		
		return "success";

	}
		
		
		
	
	
	

}
