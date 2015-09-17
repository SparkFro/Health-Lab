package healthLab3;
import java.util.Scanner;

public class health3 {
	

	   public static void main (String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int userAgeYears = 0;
	      int userAgeDays  = 0;
	      int userAgeHours  = 0;
	      int userAgeMin  = 0;
	      int userAgeSec  = 0;
	      int userSneeze = 0;
	      
	      System.out.println("Enter your age in years: ");
	      userAgeYears = scnr.nextInt();
	      
	      userAgeDays = userAgeYears * 365;
	      userSneeze = userAgeDays * 4;
	      
	   System.out.print("You have sneezed aproximatley " + userSneeze + " in your life time" );
	      
	   }
}
