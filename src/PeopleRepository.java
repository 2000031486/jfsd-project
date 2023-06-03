package com.klu.projects.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.klu.projects.model.Admin;
import com.klu.projects.model.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, Integer>{
	@Query("select e from People e where username=?1 and password=?2 ")
	public People checkpeoplelogin(String uname, String pwd);
	@Query("select e from People e where username=?1")
	public People viewpeople(String uname);
	@Transactional
	@Modifying
	@Query("update People e set e.password=?1 where e.password=?2 and e.username=?3")
	public int updatepeoplepassword(String empnewpwd,String empoldpwd,String empuname);
}
