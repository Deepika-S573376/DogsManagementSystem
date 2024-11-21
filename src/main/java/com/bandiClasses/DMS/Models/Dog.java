package com.bandiClasses.DMS.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*
 * 
 * @S573376 Deepika Mukku
 * 
 * 
 */
@Entity
public class Dog {
	@Id
	private int id;
	private String name;
	private String breed;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + "]";
	}
	public void setTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
