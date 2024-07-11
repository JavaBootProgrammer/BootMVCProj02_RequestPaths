package com.nt.comtroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	@GetMapping("/")
	public String homePage()
	{
		System.out.println("HomeController.homePage()");
		return "welcome";
	}
	
	
	@GetMapping("/param")
	public String showSharedParam(Map<String, String> obj) {
		System.out.println("---------------");
		
		System.out.println("HomeController.showSharedParam()"+obj.getClass());
		obj.put("name", "iPhone");
		obj.put("brand", "Apple");  
		System.out.println("end of param");
		
		return "display";
		
		
	}
	
	@GetMapping("/paramModel")
	public String showSharedParamModel(Model model ) {
		System.out.println("HomeController.showSharedParam()"+model.getClass());
		
		model.addAttribute("name", "iPhone");
		model.addAttribute("brand", "Apple");
	
		System.out.println("end of paramModel");
		return "display";
		
		
	}
	
	@GetMapping("/paramModelMap")
	public String showSharedParamModel(ModelMap model ) {
		System.out.println("HomeController.showSharedParam()"+model.getClass());
		
		model.addAttribute("name", "iPhone");
		model.addAttribute("brand", "Apple");
	
		System.out.println("end of paramModelMap");
		return "display";
		
		
	}
	
	@GetMapping("/welcome")
	public Model showSharedParamModel( ) {
		
		Model model = new BindingAwareModelMap();
		model.addAttribute("name", "iPhone");
		model.addAttribute("brand", "Apple");
	
		System.out.println("end of paramModelMap");
		return model;
		
		
	}
	
}
