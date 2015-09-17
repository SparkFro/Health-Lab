package healthLab;

import java.util.Scanner;

public class health {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
      int userAgeHours  = 0;
      int userAgeMin  = 0;
      int userAgeSec  = 0;
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
      userAgeHours = userAgeDays * 24;
      userAgeMin = userAgeHours * 60;
      userAgeSec = userAgeMin * 60;
      

      System.out.println("Your Age in Minutes is " + userAgeMin + " and " + userAgeSec + " Seconds");  
      
      return;
   }
}