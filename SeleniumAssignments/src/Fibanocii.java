import java.util.Scanner;

public class Fibanocii {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			int a,b, temp;
			
			System.out.println("Series starts from..");
			a = input.nextInt();
			b = a+1;
			
			System.out.println("Enter the limit");
			int limit = input.nextInt();
			
			System.out.println("Fibanocii Series printing below:");
			System.out.print(a+" "+b);
			
			for(int i = 2; i<limit ; i++)
			{
				temp = a + b;
				System.out.print("  "+temp+" ");
				a = b;
				b =temp;
			}
		}

	}

}
