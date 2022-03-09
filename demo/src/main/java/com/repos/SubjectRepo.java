package com.repos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.models.Subject;
import com.models.User;
import com.repo.interfaces.IRepoSubject;

@Repository()
public class SubjectRepo implements IRepoSubject
{
	private JdbcTemplate template;

	@Override
	public List<Subject> getAll() 
	{
		List<Subject> result = new ArrayList<>();
		return result;
	}

	@Override
	public Subject getByID(Long id) 
	{
		return null;
	}

	@Override
	public void add(Subject object) 
	{
		
		
	}

	@Override
	public List<User> getAllUsersBySubjectId(Long id) 
	{
		//to-do
		return null;
	}

}
