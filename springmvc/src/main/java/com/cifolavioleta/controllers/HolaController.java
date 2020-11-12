package com.cifolavioleta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaController {
	@RequestMapping("/hola")
	public String hola() {
		// devolvemos el nombre del fichero .jsp
		// que queremos mostrar en la vista, dicho
		// de otra forma: es la vista de retorno
		// que necesitamos
		return "mensaje";
	}
}
