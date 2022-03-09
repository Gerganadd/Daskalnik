package com.repo.interfaces;

import java.util.List;

import com.models.Subject;
import com.models.User;

public interface IRepoSubject extends IRepo<Subject>
{
	List<User> getAllUsersBySubjectId(Long id);
}
