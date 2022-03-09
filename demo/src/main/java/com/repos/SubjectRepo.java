package com.repos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.models.Subject;
import com.models.User;
import com.repo.interfaces.IRepoSubject;

@Repository("hashMapSubjectRepo")
public class SubjectRepo implements IRepoSubject
{
	Map<Long, Subject> repo = new HashMap<>();
	Long id = 0L;

	@Override
	public List<Subject> getAll() 
	{
		return new ArrayList<Subject>(repo.values());
	}

	@Override
	public Subject getByID(Long id) 
	{
		return repo.get(id);
	}

	@Override
	public void add(Subject object) 
	{
		object.setId(++id);
		repo.put(id, object);
		
	}

	@Override
	public List<User> getAllUsersBySubjectId(Long id) 
	{
		//to-do
		return null;
	}

}
