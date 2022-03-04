package com.pruebaheroku.repo.api;

import org.springframework.data.repository.CrudRepository;

import com.pruebaheroku.entidades.Usuario;

public interface UsuarioRepoApi extends CrudRepository<Usuario, Long> {

}
