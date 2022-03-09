package com.repos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.models.Subject;
import com.models.User;
import com.repo.interfaces.IRepoUser;

@Repository("hashMapUserRepo")
public class UserRepo implements IRepoUser
{
	private Map<Long, User> repo = new HashMap<>();
	private Long id = 0L;

	@Override
	public List<User> getAll()
	{
		return null;
	}

	@Override
	public User getByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> getAllSubjectByUserId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
