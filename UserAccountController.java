package com.dating.snera.dating.controller;

import com.dating.snera.dating.dao.UserAccountDAO;
import com.dating.snera.dating.dao.UserAccountImpl;
import com.dating.snera.model.Interest;
import com.dating.snera.model.UserAccount;

public class UserAccountController {

	public static void main(String[] args) {

		UserAccountController controller = new UserAccountController();
//		controller.findAllUsers();
		controller.findMatchingUsers();
//		controller.findAllUsers();
	}
	 
	public void registerUser() {
		UserAccountDAO dao = new UserAccountImpl();
		 UserAccount userAccount = new UserAccount();
		 
		 userAccount.setId(1);
		 userAccount.setAge(30); 
		 userAccount.setCity("Pune"); 
		 userAccount.setCountry("India"); 
		 userAccount.setEmail("a@b.com"); 
		 userAccount.setGender("F");  
		 userAccount.setPassword("pass123"); 
		 userAccount.setPhoneNumber("1233456789");
		 
		 Interest interest = new Interest();
		 interest.setId(1);
		 interest.setLikes("watiching movies");
		 interest.setHobbies("Playing Chess");
		 
		 
		 userAccount.setInterest(interest);
		 dao.save(userAccount);
//		 System.out.println(dao.findById(1));
	}
	public void findAllUsers() {
		UserAccountDAO dao = new UserAccountImpl();
		 createUsers(dao);
		 
//		 dao.save(userAccount2);
//		 dao.delete(2);
//		 System.out.println(dao.findAll());
		 
		
	}
	public void findMatchingUsers() {
		UserAccountDAO dao = new UserAccountImpl();
		 createUsers(dao);
		 
//		 dao.delete(2);
		 System.out.println(dao.findMatches(30, "Pune"));
		 
		
	}

	private void createUsers(UserAccountDAO dao) {
		UserAccount userAccount = new UserAccount();
		 
		 userAccount.setId(1);
		 userAccount.setUserName("Snera");
		 userAccount.setAge(70); 
		 userAccount.setCity("Pune"); 
		 userAccount.setCountry("India"); 
		 userAccount.setEmail("a@b.com"); 
		 userAccount.setGender("F");  
		 userAccount.setPassword("pass123"); 
		 userAccount.setPhoneNumber("1233456789");
		 
		 Interest interest = new Interest();
		 interest.setId(1);
		 interest.setLikes("watiching movies");
		 interest.setHobbies("Playing Chess");
		 
		 
		 userAccount.setInterest(interest);
		 dao.save(userAccount);
//		 System.out.println(dao.findById(1));
		 
		 
		 UserAccount userAccount2 = new UserAccount();
		 
		 userAccount2.setId(2);
		 userAccount2.setUserName("Purva");
		 userAccount2.setAge(30); 
		 userAccount2.setCity("Pune"); 
		 userAccount2.setCountry("India"); 
		 userAccount2.setEmail("a@b.com"); 
		 userAccount2.setGender("F");  
		 userAccount2.setPassword("pass123"); 
		 userAccount2.setPhoneNumber("1233456789");
		 dao.save(userAccount2);
	}

}
