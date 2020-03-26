package br.com.TedSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultaController {
	
@RequestMapping("/")
public String multas() {
		
return "multas";
	
}

}
