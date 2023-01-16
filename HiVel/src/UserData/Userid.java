package UserData;
import java.util.*;


public class Userid {
	static String Password;
	public static  void user() {
		
		System.out.println("Enter the password");
		Scanner s=new Scanner(System.in);
		Password=s.nextLine();
	}
	public static void main(String[] args) {
		
		String Username;
		System.out.println("Enter the user name");
		Scanner sc=new Scanner(System.in);
		Username=sc.nextLine();
		user();
		while(Password.length()==8) {
		if(Password.length()==8) {
			System.out.println("Your Username is " + Username);
			System.out.println("Your Password is " + Password);
			
		}
		else {
			System.out.println("Please Enter The 8 digit value password");
			user();
			System.out.println("Your Username is " + Username);
			System.out.println("Your Password is " + Password);
			}
		}
	}}
		
		