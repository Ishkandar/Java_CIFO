package customersh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import customersh2.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService service;

	@RequestMapping("/show")
	public String showCustomers(Model model) {

		model.addAttribute("clients", service.findAll());
		return "shoping/clients";
	}
}