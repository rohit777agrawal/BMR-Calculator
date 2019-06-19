import java.util.Scanner;

public class Project8 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	
	{
		int W=0, H=0, A=0; 
		Double MaleBMR, WomenBMR, C;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter your weight in pounds");
		W = keyboard.nextInt();
		System.out.println("Please enter your height in inches");
		H = keyboard.nextInt();
		System.out.println("Please enter your age in years");
		A = keyboard.nextInt();
		MaleBMR= 66 + (6.3 * W) + (12.9 * H) - (6.8 * A);
				
		System.out.println("Your need " + MaleBMR + " calories to maintain weight");
			
		C = MaleBMR/230;
				
		System.out.println("You need to eat " + C + " candy bars in one day");
		
		//start with 
		
		System.out.println("Please enter your weight in pounds");
		W = keyboard.nextInt();
		System.out.println("Please enter your height in inches");
		H = keyboard.nextInt();
		System.out.println("Please enter your age in years");
		A = keyboard.nextInt();
			
		WomenBMR= 655 + (4.3 * W) + (4.7 * H) - (4.7 * A);
			
		System.out.println("Your need " +WomenBMR + "calories to maintain weight");
			
		C = WomenBMR/230;
			
		System.out.println("You need to eat " + C + " candy bars in one day");

			
		
	}//end of String

	
}