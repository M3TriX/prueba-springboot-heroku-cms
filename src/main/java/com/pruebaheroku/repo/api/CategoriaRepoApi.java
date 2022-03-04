package com.pruebaheroku.repo.api;

import org.springframework.data.repository.CrudRepository;

import com.pruebaheroku.entidades.Categoria;

public interface CategoriaRepoApi extends CrudRepository<Categoria, Long> {

}
