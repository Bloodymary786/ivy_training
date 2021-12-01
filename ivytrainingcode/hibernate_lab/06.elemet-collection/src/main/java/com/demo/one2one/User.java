package com.demo.one2one;

import java.util.*;

import javax.persistence.*;

//Element collection? what is the need?
@Table(name="user_table")
@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	
	@ElementCollection
	@CollectionTable(name="user_profile")
	private List<String> profiles = new ArrayList<String>();
	
	public User() {
	}

	public void addProfile(String profile) {
		profiles.add(profile);
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public List<String> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<String> profiles) {
		this.profiles = profiles;
	}


}
