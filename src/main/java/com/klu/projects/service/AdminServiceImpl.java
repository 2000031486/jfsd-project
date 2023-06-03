package com.klu.projects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.projects.model.Admin;
import com.klu.projects.model.People;
import com.klu.projects.repository.AdminRepository;
import com.klu.projects.repository.PeopleRepository;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	 private AdminRepository adminRepository;
	@Autowired
	private PeopleRepository peopleRepository;
	@Override
	 public Admin checkadminlogin(String uname, String pwd)
	 {
	  
	  return adminRepository.checkadminlogin(uname, pwd);
	  }
	@Override
	public List<People> viewallpeople() {
		// TODO Auto-generated method stub
		return (List<People>)peopleRepository.findAll();
	}
	@Override
	public void deletepeople(int id) {
		// TODO Auto-generated method stub
		peopleRepository.deleteById(id);
	}
	 }

