package com.stop.publicPage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class InicioController {

	
    @GetMapping("/")
	public String index() {
    	
       //Creo el usuario por defecto	
 	   //try {	
 		//inicioAplicacionService.iniciarAplicacion();
 	   //}catch(Exception e) {}	
    	
	   return "index.html";
	}
/*
	@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
	@GetMapping("/inicio")
	public String inicio(HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("usuariosession");

		if (usuario != null) {
			if (usuario.getRol().toString().equals("ADMIN")) {
				return "redirect:/admin/dashboard";
			}else {
				return "inicio";
			}
		}else {
			return "index";
		}
	}

	@GetMapping("/regresoPage")
	public String regreso() {
		return "redirect:/inicio";
	}*/
}
