package com.pruebaheroku.repo.api;

import org.springframework.data.repository.CrudRepository;

import com.pruebaheroku.entidades.Producto;

public interface ProductoRepoApi extends CrudRepository<Producto, Long> {

}
