package com.telusko.secureapp.Entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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



	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	//userinfo setup

	private int age;
	private int height;
	private int weight;
	private String gender;
	private String goal;

	public User(int age, int height, int weight, String gender, String goal) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.goal = goal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}
}
