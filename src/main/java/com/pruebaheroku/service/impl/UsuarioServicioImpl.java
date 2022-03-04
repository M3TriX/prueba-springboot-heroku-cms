package com.pruebaheroku.service.impl;

import org.springframework.data.repository.CrudRepository;

import com.pruebaheroku.comun.GenericServiceImpl;
import com.pruebaheroku.entidades.Usuario;
import com.pruebaheroku.repo.api.UsuarioRepoApi;
import com.pruebaheroku.service.api.UsuarioServiceApi;

public class UsuarioServicioImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioServiceApi{
	
	private UsuarioRepoApi usuarioRepoApi;
	@Override
	public CrudRepository<Usuario, Long> getRepo() {
		return usuarioRepoApi;
	}

}
