package edu.pragmatic.homework7;

import java.util.Date;

public class AdminUserImpl  extends UserImpl implements AdminUser{
	
	UserImpl userImpl ;
	boolean isAdmin ;

	AdminUserImpl(String userName,String pass ,String personName){
		super(personName, personName, personName);
		isAdmin = true;
		
	}

	@Override
	public void  createUser(String userName,String pass,String personName) {
		userImpl = new UserImpl(userName, pass, personName);
		userImpl.getPersonName();
		
		
	}

	@Override
	public void createAdminUser(String userName,String pass,String personName) {
		AdminUserImpl newUser = new AdminUserImpl( userName, pass, personName);
		newUser.getPersonName();
	}

	@Override
	public void deleteUser(AbstractUser userForDelete) {
		System.out.printf("Delete s% user",userForDelete );
	}



}
