package com.fr.gc.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

public interface GenericDao<T, K> {

	public void save(T entity) throws Exception;

	public void update(T entity) throws Exception;

	public void delete(T entity) throws Exception;

	public T findById(K id) throws Exception;
	
	public List<T> findAll() throws Exception;
	
	public List<T> findByCriteria (Criterion Crit);
}
