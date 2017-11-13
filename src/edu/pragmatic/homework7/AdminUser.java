package edu.pragmatic.homework7;

public interface AdminUser extends User {
	
	

	 default void  createUser(String userName,String pass,String personName){		
	}
	
	default void createAdminUser(String userName,String pass,String personName) {
		
	}
	
	default void deleteUser(AbstractUser userForDelete) {
		
	}
	
}
