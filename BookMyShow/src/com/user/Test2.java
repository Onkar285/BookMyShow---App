package com.user;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import com.model.Movie;
import com.model.Snack;
import com.model.User;
import com.service.BookMyShow;
import com.service.BookingDesk;
public class Test2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
BookMyShow desk=new BookingDesk();
User u = new User();
System.out.println("Set your user and pass...");
System.out.print("Username: ");
String user = s.next();
System.out.print("Password: ");
String pass = s.next();

u.setUserName("ONKAR");
u.setPassword("123");
//strinu.getUserName().toUpperCase();
if(u.getUserName().equals(user.toUpperCase()) && u.getPassword().equals(pass))
{
	System.out.println("Welcome back "+u.getUserName());
	System.out.println("Choose option from below list:\n1.Book your ticket\n2.Add meal\n3.Print Details\n4 LogOut ");
	System.out.println("Enter your choise here:");
	int num=s.nextInt();
	switch(num){
	case 1:
		
		
          int fl=s.nextInt();
          BookingDesk film = new BookingDesk();
          
          Movie mv =null;
          switch(fl) {
          case 1:
          	//System.out.println(mv.Show());
          	mv =new Movie(1,"KGF",399,9.0f,"Good");
          	break;
          	
          case 2:
          	mv =new Movie(2,"SpiderManHomeComming",200,9.2f,"Good");
          	break;
          	
          case 3:
          	mv =new Movie(3,"Avegers",599,8.5f,"Good");
          	break;
          	
          default:
  			System.out.println("Wrong choice...");
  			System.out.println("Details: "+mv.getId()+""+ mv.getName()+" "+ mv.getPrice());
          }
          
	break;
	case 2:
	
		
		
		int ch=s.nextInt();
		BookingDesk bd = new BookingDesk();
		
		Snack snk = null;
		
		switch(ch)
		{
		case 1:
			snk = new Snack( 1 , "Veg Pizza",pass, 299);
			break;
			
		case 2:
			snk = new Snack( 2 , "Burger",pass, 99);
			break;
			
		case 3:
			snk = new Snack( 3 , "French Fries",pass, 140);
			break;
		
		default:
			System.out.println("Wrong choice...");
			System.out.println("Details: "+snk.getId()+""+ snk.getName()+" "+ snk.getPrice());
			//System.out.println(snk.getId());
		}
	
		break;
	case 3:
		
		System.out.println("***************You want to print your Details***************");
		System.out.println("1.Yes\n2.No");
		int dt=s.nextInt();
		BookingDesk dtl = new BookingDesk();
		
		
		switch(dt) {
		
		case 1:
			System.out.println(dtl.getClass());
			break;
		
		case 2:
			System.out.println("**Ok no problem enjoy your movie and snacks**");
		
		}
		break;
	case 4:
		System.out.println("***************Do you want to log out your account***************");
		System.out.println("1.Yes\n2.No");
		int Lo=s.nextInt();
		BookingDesk log = new BookingDesk();
		
		
		switch(Lo) {
		
		case 1:
			System.out.println("LogOut Suucesfully");
			break;
		
		case 2:
			System.out.println("Anything else plz press the   button");
		
		}
		break;
		
		
		
	
			
		}
		
	}
	System.out.println("***********Todays menu*********** \n"
			+ "1. Name: Veg Pizza Price: 299 \n******************************\n"
			+ "2. Name: Burger Price: 99 \n******************************\n"
			+ "3. Name: French Fries Price: 140 \n******************************\n"
			+ "Choose your meal...\n");
	
	int ch=s.nextInt();
	BookingDesk bd = new BookingDesk();
	
	Snack snk = null;
	
	switch(ch)
	{
	case 1:
		snk = new Snack( 1 , "Veg Pizza",pass, 299);
		break;
		
	case 2:
		snk = new Snack( 2 , "Burger",pass, 99);
		break;
		
	case 3:
		snk = new Snack( 3 , "French Fries",pass, 140);
		break;
	
	default:
		System.out.println("Wrong choice...");
		
	}
	System.out.println("Details: "+snk.getId()+""+ snk.getName()+" "+ snk.getPrice());
} {
      
      
	System.out.println("Wrong credentials!");
}

}

