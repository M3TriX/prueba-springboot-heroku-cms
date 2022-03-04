package com.pruebaheroku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaheroku.entidades.Usuario;
import com.pruebaheroku.service.api.UsuarioServiceApi;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioServiceApi usuarioServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list",usuarioServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id")long id,Model model)
	{
		if(id != 0L) {
			model.addAttribute("Usuario",usuarioServiceApi.get(id));
		}
		return "save";
	}
	
	@PostMapping("/save/{id}")
	public String showSave(Usuario usuario,Model model)
	{
		usuarioServiceApi.save(usuario);
		return "redirect:/";
	}
}
