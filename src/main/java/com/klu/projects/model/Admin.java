package com.klu.projects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin1000")
public class Admin {
             @Id
             @Column(length=200)
             private String username;
             @Column(nullable=false,length=200)
             private String password;
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			@Override
			public String toString() {
				return "Admin [username=" + username + ", password=" + password + "]";
			}
             
}
