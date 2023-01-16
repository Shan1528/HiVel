package UserData;
import java.util.*;

public class Prime {
	public static void main(String[] args) {
	int n=0;
	System.out.println("Enter your prime number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	boolean primenumber=true;
	for(int i=2;i<n/i;i++) {
		if(n%i==0) {
			primenumber=false;
			break;
		}}
		if(primenumber==false) {
		System.out.println("It is not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
		
		
	}}
	
	

