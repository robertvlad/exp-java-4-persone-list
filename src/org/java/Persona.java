package org.java;

import java.time.LocalDate;

public class Persona {
	
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Persona(String name, String lastName, LocalDate dateOfBirth) throws Exception {
		
		setName(name);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		
		if (name.length() <= 3 || name.length() > 32) {
			
			throw new Exception("Il nome deve avere un minimo di 4 caratteri ed un massimo di 32");
		}
		
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws Exception {
		
		if (lastName.length() <= 3  || lastName.length() > 32) {
			
			throw new Exception("Il cognome deve avere un minimo di 4 caratteri ed un massimo di 32");
		}
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFullName() {
		
		return name + " " + lastName;
	}
	
	
	@Override
	public String toString() {

		return "| (P) Name: " + getName() + " " + getLastName() + " | Date of Birth: " + getDateOfBirth() + " |"; 
	}
	
}
