package com.repo.interfaces;

import java.util.List;

public interface IRepo<T> 
{
	List<T> getAll();
	T getByID(Long id);
	void add(T object);
}
