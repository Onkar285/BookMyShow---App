package com.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.model.Movie;
import com.model.Snack;
import com.model.User;
import com.service.BookMyShow;
import com.service.BookingDesk;
public class Test {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 BookMyShow bookingDesk = new BookingDesk();
 
 List<Movie> availableMovies = new ArrayList<>();
 availableMovies.add(new Movie(1, "Game Of Thrones", 1500, 4.8f, "Action+Drama"));
 availableMovies.add(new Movie(2, "Money Hiest", 1000, 4.0f, "Action+Drama"));
 availableMovies.add(new Movie(3, "Golmaal3", 399, 3.2f, "Comedy"));
 availableMovies.add(new Movie(4, "Harry Poter", 700, 4.4f, "Drama"));

 List<Snack> availableSnacks = new ArrayList<>();
 availableSnacks.add(new Snack(1, "Veg Pizza", "", 100));
 availableSnacks.add(new Snack(2, "Burger", "", 50));
 availableSnacks.add(new Snack(3, "French Fries", "", 60));
 
 
 
 List<Movie> bookedMovies = new ArrayList<>();
 List<Snack> addedMeals = new ArrayList<>();
 while (true) {
	 User user = loginUser(sc);
	 if(user==null) {
		 continue;
	 }else {
		 printMenu();
		 int choice = sc.nextInt();
		 switch (choice) {
		 case 1:
		 Movie bookedMovie = bookingDesk.bookTicket(availableMovies);
		 if (bookedMovie != null) {
		 bookedMovies.add(bookedMovie);
		 // Showing movie name, movie price and rating
		 System.out.println("Movie booked: "+"Name:" + bookedMovie.getName() +" "+"Price: "+ bookedMovie.getPrice()+" " +"Rating: "+ bookedMovie.getRating());
		 }
		 break;
		 case 2:
		 List<Snack> addedSnacks = bookingDesk.addMeal(availableSnacks);
		 addedMeals.addAll(addedSnacks);
		 break;
		 case 3:
		 printTicketDetails(user, bookedMovies, addedMeals);
		 break;
		 case 4:
		 logout(user, bookedMovies, addedMeals);
		 return;
		 default:
		 System.out.println("Invalid choice. Please select a valid option.");
		 }
	 }
 
 }
 }
 private static User loginUser(Scanner s) {
	 User u=new User();
	System.out.println(" HEllo Welcome to the BookMyShow... plz enter your username & password correct");
	System.out.print("Enter your username: ");
	String username = s.next();
	System.out.print("Enter your password: ");
	String password = s.next();
	// The application will be logged in only when the username and password are correct....!
	u.setUserName("ONKAR");
	u.setPassword("123");
	// There is no rearranging for lowercase or uppercase, you just type your username correctly....!
	if(u.getUserName().equals(username.toUpperCase()) && u.getPassword().equals(password)) {
		System.out.println("Welcome back"+" "+u.getUserName());
		return u;
	}
	
	else   {
		System.out.println("Invalid UserName & PassWord Plz Do the correct information");
		return null;
	}
	 
	
	
 }
 private static  void printMenu() {
	 
	 // Choose the below options...!
	 System.out.println("Choose option from below list:\n1.Book your ticket\n2.Add meal\n3.Print Details\n4 LogOut ");


 }
 private static  void printTicketDetails(User user, List<Movie> bookedMovies, List<Snack> 
addedMeals) {
 System.out.println("\nTicket Details for " + user.getUserName());
 System.out.println("Booked Movies:");
 for (Movie movie : bookedMovies) {
 System.out.println(movie.getName()+" "+"Price "+movie.getPrice());
 
 System.out.println("Added Snacks:");
 for (Snack snack : addedMeals) {
 System.out.println(snack.getName()+" "+"price "+snack.getPrice());
 //The total cost of your order....!
 System.out.println("Total cost of your movie and meal:"+(snack.getPrice()+movie.getPrice()));
 }
 }
 }
 private static  void logout(User user, List<Movie> bookedMovies, List<Snack> 
addedMeals) {
 System.out.println("LogOut SuccessFully " + user.getUserName()+" " +"Enjoy your Movie And Snacks...!" );
 
 }
}


//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Scanner;
//import com.model.Movie;
//import com.model.Snack;
//import com.model.User;
//import com.service.BookMyShow;
//import com.service.BookingDesk;
//public class Test {
//public static void main(String[] args) {
//Scanner s=new Scanner(System.in);
//BookMyShow desk=new BookingDesk();
//User u = new User();
//System.out.println("Set your user and pass...");
//System.out.print("Username: ");
//String user = s.next();
//System.out.print("Password: ");
//String pass = s.next();
//
//u.setUserName("ONKAR");
//u.setPassword("123");
////strinu.getUserName().toUpperCase();
//if(u.getUserName().equals(user.toUpperCase()) && u.getPassword().equals(pass))
//{
//	System.out.println("Welcome back "+u.getUserName());
//	System.out.println("Choose option from below list:\n1.Book your ticket\n2.Add meal\n3.Print Details\n4 LogOut ");
//	System.out.println("Enter your choise here:");
//	int num=s.nextInt();
//	switch(num){
//	case 1:
//		
//		
//            int fl=s.nextInt();
//            BookingDesk film = new BookingDesk();
//            
//            Movie mv =null;
//            switch(fl) {
//            case 1:
//            	System.out.println(mv.Show());
//            	mv =new Movie(1,"KGF",399,9.0f,"Good");
//            	break;
//            	
//            case 2:
//            	mv =new Movie(2,"SpiderManHomeComming",200,9.2f,"Good");
//            	break;
//            	
//            case 3:
//            	mv =new Movie(3,"Avegers",599,8.5f,"Good");
//            	break;
//            	
//            default:
//    			System.out.println("Wrong choice...");
//    			System.out.println("Details: "+mv.getId()+""+ mv.getName()+" "+ mv.getPrice());
//            }
//            
//	break;
//	case 2:
//	
//		
//		
//		int ch=s.nextInt();
//		BookingDesk bd = new BookingDesk();
//		
//		Snack snk = null;
//		
//		switch(ch)
//		{
//		case 1:
//			snk = new Snack( 1 , "Veg Pizza",299);
//			break;
//			
//		case 2:
//			snk = new Snack( 2 , "Burger",99);
//			break;
//			
//		case 3:
//			snk = new Snack( 3 , "French Fries",140);
//			break;
//		
//		default:
//			System.out.println("Wrong choice...");
//			System.out.println("Details: "+snk.getId()+""+ snk.getName()+" "+ snk.getPrice());
//			//System.out.println(snk.getId());
//		}
//	
//		break;
//	case 3:
//		
//		System.out.println("***************You want to print your Details***************");
//		System.out.println("1.Yes\n2.No");
//		int dt=s.nextInt();
//		BookingDesk dtl = new BookingDesk();
//		
//		
//		switch(dt) {
//		
//		case 1:
//			System.out.println(dtl.getClass());
//			break;
//		
//		case 2:
//			System.out.println("**Ok no problem enjoy your movie and snacks**");
//		
//		}
//		break;
//	case 4:
//		System.out.println("***************Do you want to log out your account***************");
//		System.out.println("1.Yes\n2.No");
//		int Lo=s.nextInt();
//		BookingDesk log = new BookingDesk();
//		
//		
//		switch(Lo) {
//		
//		case 1:
//			System.out.println("LogOut Suucesfully");
//			break;
//		
//		case 2:
//			System.out.println("Anything else plz press the   button");
//		
//		}
//		break;
//		
//		
//		
//	
//			
//		}
//		
//	}
//	System.out.println("***********Todays menu*********** \n"
//			+ "1. Name: Veg Pizza Price: 299 \n******************************\n"
//			+ "2. Name: Burger Price: 99 \n******************************\n"
//			+ "3. Name: French Fries Price: 140 \n******************************\n"
//			+ "Choose your meal...\n");
//	
//	int ch=s.nextInt();
//	BookingDesk bd = new BookingDesk();
//	
//	Snack snk = null;
//	
//	switch(ch)
//	{
//	case 1:
//		snk = new Snack( 1 , "Veg Pizza",299);
//		break;
//		
//	case 2:
//		snk = new Snack( 2 , "Burger",99);
//		break;
//		
//	case 3:
//		snk = new Snack( 3 , "French Fries",140);
//		break;
//	
//	default:
//		System.out.println("Wrong choice...");
		
//	}
//	System.out.println("Details: "+snk.getId()+""+ snk.getName()+" "+ snk.getPrice());
//}
//else {
//	System.out.println("Wrong credentials!");
//}
//
//}
//}
//System.out.println("Welcome to BookMyShow!");
//System.out.print("Enter your username: ");
//String username = scanner.next();
//System.out.print("Enter your password: ");
//String password = scanner.next();
//return new User(username, password);