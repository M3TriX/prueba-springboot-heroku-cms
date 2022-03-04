package com.pruebaheroku.comun;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class GenericServiceImpl<T,ID extends Serializable>implements GenericServiceApi<T, ID> {

	@Override
	public T save(T entity) {
		return getRepo().save(entity);
	}

	@Override
	public void delete(ID id) {
		getRepo().deleteById(id);
	}

	@Override
	public T get(ID id) {
		Optional<T> obj = getRepo().findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Override
	public List<T> getAll() {
		List<T> returnList = new ArrayList<>();
		getRepo().findAll().forEach(obj ->returnList.add(obj));
		return null;
	}
	
	public abstract CrudRepository<T,ID> getRepo();

}
