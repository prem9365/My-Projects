package springmvc;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	
	
	@RequestMapping("/home")
	public String home(Model model){
		
		model.addAttribute("name","Premkumar Talghatt");
		model.addAttribute("id",1213);
		
		List <String> list= new ArrayList<String>();
		list.add("prem");
		list.add("Amar");
		list.add("Bhavna");
		list.add("Aalam weds Khushi  ");
		
		model.addAttribute("frd",list);
		
		System.out.println("inside home ");
		return "index";
		
		
		
	}
	
	@RequestMapping("album")
	public String album(){
		
		System.out.println("inside the Album URL");
		return"album";
	}
	
	//Model And View...
	@RequestMapping("/help")
	public ModelAndView help(){
		
		System.out.println("this is help controller");
		
		ModelAndView modelAndView = new ModelAndView();
		
		LocalDateTime time = LocalDateTime.now();
		
		
		//Setting the Data
		modelAndView.addObject("name","Amar Talaghatt");
		
		
		modelAndView.addObject("time",time);
		
		modelAndView.addObject("roll number",1341298);
		
		
		//Setting the name of the View......!
		modelAndView.setViewName("help");
		
		return modelAndView ;
	}

}
