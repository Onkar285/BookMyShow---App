package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.model.Movie;
import com.model.Snack;
import com.model.User;

 
    public  class BookingDesk implements BookMyShow {
    
    	
        private Scanner s = new Scanner(System.in);
        private List<Movie> bookedMovies = new ArrayList<>(); 
        private List<Snack> addedMeals = new ArrayList<>(); 
        private Map<Integer, List> userBookings = new HashMap<>(); 
        public Movie bookTicket(List<Movie> mv) {
        System.out.println("Available Movies:");
        for (int i = 0; i < mv.size(); i++)
        {
        	// Showing movie name,movie prize & rating....!
        System.out.println((i + 1) +" "+ " Movie Name:-" +" "+ mv.get(i).getName()+" "+ "Price:- " + mv.get(i).getPrice()+" "+ "Rating:-" +" "+ mv.get(i).getRating()+" "+ "Genre:- " + mv.get(i).getGenre());
 }
        System.out.print("Select a movie (enter the movie number): ");
        int choice = s.nextInt();
        s.nextLine(); 
        if (choice >= 1 && choice <= mv.size()) {
        Movie selectedMovie = mv.get(choice - 1);
        bookedMovies.add(selectedMovie);
        System.out.println("You have booked the movie: " + selectedMovie.getName() +" "+"Prize: "+ selectedMovie.getPrice());
        return selectedMovie;
 }    
        else
 {
       System.out.println("Invalid choice. Please select a valid movie.");
       return null;
 }
 }
       public List<Snack> addMeal(List<Snack> sn) {
       System.out.println("Available Snacks:");
       for (int i = 0; i < sn.size(); i++) 
       {
    	// Showing meal name & meal prize....!
       System.out.println((i + 1) +" "+ "Meal name: " + sn.get(i).getName()+" "+ "Prize: " + sn.get(i).getPrice());
}
       List<Snack> selectedSnacks = new ArrayList<>();
       while (true) {
       System.out.print("Select a snack to add (enter the snack number, 0 to finish): ");
       int choice = s.nextInt();
       s.nextLine(); 
       if (choice == 0)
 {
     break;
 } 
       else if (choice >= 1 && choice <= sn.size()) {
       Snack selectedSnack = sn.get(choice - 1);
       selectedSnacks.add(selectedSnack);
       System.out.println("You have added " + selectedSnack.getName() + " to your meal.");
 } 
       else
       {
         System.out.println("Invalid choice. Please select a valid snack or enter 0 to finish.");
 }
 }
      addedMeals.addAll(selectedSnacks);
      return selectedSnacks;
 }
 @Override
       public void printDetails(Map<Integer, List> m) {
       for (Map.Entry<Integer, List> entry : m.entrySet()) {
       int userId = entry.getKey();
       List<Object> userBookingDetails = entry.getValue();
       System.out.println("User ID: " + userId);
       System.out.println("Booked Movies:");
       for (Object obj : userBookingDetails) {
       if (obj instanceof Movie) {
       System.out.println("- " + ((Movie) obj).getName());
 }
 }
       System.out.println("Added Meals:");
       for (Object obj : userBookingDetails) {
       if (obj instanceof Snack) {
       System.out.println("- " + ((Snack) obj).getName());
 }
 }
 }
 }
      public void logOut() {
      System.out.println("logout Sucessfully Enojoy your movie and snaks ");

}
}