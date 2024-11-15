package com.stop.publicPage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Controller
public class InicioController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/")
	public String index(Model model) {
		// Asegúrate de que la URL correcta es la de '/servicio/obtener'
		String url = "http://localhost:9000/servicio/obtener";

		// Obtén la lista de servicios directamente
		List<Map<String, Object>> servicios = restTemplate.getForObject(url, List.class);

		// Añade la lista de servicios al modelo para mostrarla en la vista
		model.addAttribute("servicios", servicios);
		return "index";
	}



}
