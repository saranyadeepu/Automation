import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int c=1, a, flag =0;
		Scanner input = new Scanner(System.in);
		do
		{
		System.out.println("Enter the number");
		a = input.nextInt();
		
		if(a == 0|| a== 1) 
			System.out.println(a +" is not a Prime Number");
			
		else if(a ==  2) 
			System.out.println(a +" is  a Prime Number");
			
		else  {
		 for (int i = 2; i <= a / 2; ++i) {
		     if (a % i == 0) {
		        flag = 1;
		        break;
		      }
		     else
		    	 flag = 0;
		    }

		if(flag==1){
			System.out.println(a +" is not a Prime Number");
		}
		else
			System.out.println(a +" is a Prime Number");	
		}
		System.out.println("Do you want to continue 0- exit, 1 to continue");
		try
		{c = input.nextInt();
		}
		catch(Exception ex) {
			System.out.println("Invalid Choice");
		}
			
	}while(c!=0);
	}
}
