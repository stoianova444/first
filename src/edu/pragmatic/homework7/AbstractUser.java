package edu.pragmatic.homework7;

import java.util.Date;

public abstract class AbstractUser {
	
	String userName ;
	String password ;
	
	String personName ;
	
	Date dateOfRegistration;
	
	 Date getDateOfRegistration() {
		 return this.dateOfRegistration;
		 
		
	}
	 

		public String  getPersonName() {
			return this.personName ;
		} 
		
		void login(String userName, String pass) {
			System.out.printf("Chek s% and s% in sistem", userName, userName);
			
		}

}
