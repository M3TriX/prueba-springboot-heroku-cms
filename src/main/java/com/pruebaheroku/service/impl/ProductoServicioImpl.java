package com.pruebaheroku.service.impl;

import org.springframework.data.repository.CrudRepository;

import com.pruebaheroku.comun.GenericServiceImpl;
import com.pruebaheroku.entidades.Producto;
import com.pruebaheroku.repo.api.ProductoRepoApi;
import com.pruebaheroku.service.api.ProductoServiceApi;

public class ProductoServicioImpl extends GenericServiceImpl<Producto, Long> implements ProductoServiceApi{
	
	private ProductoRepoApi productoRepoApi;
	@Override
	public CrudRepository<Producto, Long> getRepo() {
		return productoRepoApi;
	}

}
