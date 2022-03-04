package com.pruebaheroku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebaheroku.entidades.Producto;
import com.pruebaheroku.service.api.ProductoServiceApi;

@Controller
public class ProductoController {

	@Autowired
	private ProductoServiceApi productoServiceApi;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list",productoServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id")long id,Model model)
	{
		if(id != 0L) {
			model.addAttribute("producto",productoServiceApi.get(id));
		}
		return "save";
	}
	
	@PostMapping("/save/{id}")
	public String showSave(Producto producto,Model model)
	{
		productoServiceApi.save(producto);
		return "redirect:/";
	}
}
