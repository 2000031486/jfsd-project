package com.klu.projects.service;

import com.klu.projects.model.People;

public interface PeopleService  {
     public People addpeople(People people);
     public People checkpeoplelogin(String uname,String pwd);
     public People viewpeople(String uname);
 	public  int  changepeoplepassword(String oldpwd,String newpwd,String euname);
     
}
