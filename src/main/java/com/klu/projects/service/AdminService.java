package com.klu.projects.service;

import java.util.List;

import com.klu.projects.model.Admin;
import com.klu.projects.model.People;

public interface AdminService {

public Admin checkadminlogin(String uname, String pwd);
public List<People> viewallpeople();

public void deletepeople(int id);
}
