package UserData;
import java.util.regex.*;

public class MyStr {

	public static void main(String[] args) {
       String s="Hi Shanmugavel how are you";
       String words[]=s.split(" ");
       
     
       StringBuilder stringb = new StringBuilder();
       for (int i =words.length-1; i >=0; i--) {
           stringb.append(words[i]+" ");
       }
       stringb.reverse();
       System.out.println(stringb);
       
       System.out.println("The count of the String " + words.length);
       System.out.println(Pattern.matches("s","s" ));
	}

}