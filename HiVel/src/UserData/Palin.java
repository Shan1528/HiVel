package UserData;
import java.util.*;

public class Palin {
	public static void main(String[] args) {
		String num;
		System.out.println("Enter the number to check palindrome");
		try (Scanner n = new Scanner(System.in)) {
			num=n.next();
		}
		StringBuilder Str=new StringBuilder(num);
		
		Str.reverse();
		System.out.println(Str);	
		if(num.equals(Str.toString())) {
			System.out.println("It is palindrome number "+num);
		}
		else {
			System.out.println("It is not a palindrome number "+num);
		}
				
			}
		
	
		}
	
		
	

