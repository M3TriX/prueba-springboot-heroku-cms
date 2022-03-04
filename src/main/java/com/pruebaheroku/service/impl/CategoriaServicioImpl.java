package com.pruebaheroku.service.impl;

import org.springframework.data.repository.CrudRepository;

import com.pruebaheroku.comun.GenericServiceImpl;
import com.pruebaheroku.entidades.Categoria;
import com.pruebaheroku.repo.api.CategoriaRepoApi;
import com.pruebaheroku.service.api.CategoriaServiceApi;

public class CategoriaServicioImpl extends GenericServiceImpl<Categoria, Long> implements CategoriaServiceApi{
	
	private CategoriaRepoApi categoriaRepoApi;
	@Override
	public CrudRepository<Categoria, Long> getRepo() {
		return categoriaRepoApi;
	}

}
