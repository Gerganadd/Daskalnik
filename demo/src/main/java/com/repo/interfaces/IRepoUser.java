package com.repo.interfaces;

import java.util.List;

import com.models.Subject;
import com.models.User;

public interface IRepoUser extends IRepo<User>
{
	List<Subject> getAllSubjectByUserId(Long id);
}
