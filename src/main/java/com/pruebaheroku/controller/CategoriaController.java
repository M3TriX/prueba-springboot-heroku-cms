package com.pruebaheroku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaheroku.entidades.Categoria;
import com.pruebaheroku.service.api.CategoriaServiceApi;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaServiceApi categoriaServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list",categoriaServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id,Model model)
	{
		if(id != null && id != 0) {
			model.addAttribute("categoria",categoriaServiceApi.get(id));
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Categoria categoria,Model model)
	{
		categoriaServiceApi.save(categoria);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id,Model model)
	{
		categoriaServiceApi.delete(id);
		return "redirect:/";
	}
}
