import java.util.Scanner;

public class ForEachForLoop {
	public static void main(String args[]) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = input.next();
	System.out.println("Length of String: "+str.length());
	String rev ="";
	char ch;
	
	for(int i=0; i<str.length();i++)
	{
		ch = str.charAt(i);	
		rev+=ch+rev;
	}
	System.out.println("Reverse String = "+rev);
	}
}
