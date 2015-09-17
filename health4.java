package healthLab4;

import java.util.Scanner;

public class health4 {
   public static void main (String[] args) {
	
	   Scanner scnr = new Scanner(System.in);
	      int userAgeYears = 0;
	      int userAgeDays  = 0;
	      int userAgeHours  = 0;
	      int userAgeMin  = 0;
	      int userAgeSec  = 0;
	      int userCalories = 0;
	      int userSandwich = 0;
	      System.out.println("Enter your age in years: ");
	      userAgeYears = scnr.nextInt();
	      
	      userAgeDays = userAgeYears * 365;
	      userAgeHours = userAgeDays * 24;
	      userAgeMin = userAgeHours * 60;
	      userAgeSec = userAgeMin * 60;
	      userCalories = userAgeDays * 2640;
	      userSandwich = userCalories / 525;
	      
	      
	      System.out.println("On Average you have eaten " + userCalories + " calories and that adds up to " + userSandwich + " sandwiches"  );
   
   }
 }
