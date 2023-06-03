package com.klu.projects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.projects.model.People;
import com.klu.projects.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService{

	
	@Autowired
	private PeopleRepository peopleRepository;
	@Override
	public People addpeople(People people) {
		return peopleRepository.save(people);
		
	}
	@Override
	public People checkpeoplelogin(String uname, String pwd) {
		// TODO Auto-generated method stub
		return peopleRepository.checkpeoplelogin(uname, pwd);
	}
	@Override
	public int changepeoplepassword(String oldpwd, String newpwd, String euname) {
		// TODO Auto-generated method stub
		return peopleRepository.updatepeoplepassword(newpwd, oldpwd, euname);
	}
	@Override
	public People viewpeople(String uname) {
		// TODO Auto-generated method stub
		return peopleRepository.viewpeople(uname);
	}

}
