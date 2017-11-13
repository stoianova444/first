package edu.pragmatic.homework7;

import java.util.Date;

public class UserImpl extends AbstractUser  implements User {
	
	 UserImpl(String userName, String pass, String personName ) {		
		this.dateOfRegistration = new Date() ;
		this.userName = userName;
		this.password = pass;
		this.personName = personName;
	}




	public static void main(String[] args) {
		 UserImpl test = new UserImpl("ime", "pass", "chovekIme");
		 System.out.println(test.getDateOfRegistration());
		
	}
	
	

}
