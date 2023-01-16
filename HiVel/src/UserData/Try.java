package UserData;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Try {

	public static void main(String[] args) {
		String Password1 ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8}$";
        Pattern pattern = Pattern.compile(Password1);
        System.out.println("Please Enter  password");
			String Password;
			Scanner se=new Scanner(System.in);
			Password=se.nextLine();
			 Matcher matcher = pattern.matcher(Password);
		     System.out.println("Your Password is " + Password);
			System.out.println("Password  matches pattern : "+matcher.matches());
	
	}

}
