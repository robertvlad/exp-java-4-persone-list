package org.java;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		printPersonsToFile();
		seachByName();

		System.out.println("End \n --------------------------------------------");
	}
	
	
	public static void seachByName() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il nome da cercare");
		String searchName = sc.nextLine();		
		
		try {
			
			File mioF = new File("C:\\Users\\vladr\\Desktop\\nomi.txt");
			
			Scanner reader = new Scanner(mioF);
			
			while (reader.hasNextLine()) {
				
				String fullName = reader.nextLine();
				
				if (fullName.toLowerCase().contains(searchName.toLowerCase())){
					
					System.out.println(fullName);
				}
			}
			
			reader.close();
		} 
		catch (Exception e) {

			System.err.println("Errore nella letture di nominativi: " + e.getMessage());
		}
		
		sc.close();		
	}
	
	
	public static void printPersonsToFile() {
		
		FileWriter myW = null;
		
		try {
			
			myW = new FileWriter("C:\\Users\\vladr\\Desktop\\nomi.txt");
			
			Persona p = new Persona("AAAA", "BBBB", LocalDate.parse("1999-03-04"));
			myW.write(p.getFullName() + "\n");
			
			p = new Persona("CCCC", "DDDD", LocalDate.parse("1999-03-04"));
			myW.write(p.getFullName() + "\n");
			
			p = new Persona("EEEE", "FFFF", LocalDate.parse("1999-03-04"));
			myW.write(p.getFullName() + "\n");
			
			p = new Persona("GGGG", "HHHH", LocalDate.parse("1999-03-04"));
			myW.write(p.getFullName() + "\n");
			
			myW.close();
		} 
		catch (Exception e) {

			System.err.println("Errore: " + e.getMessage());
		}
	}
}
