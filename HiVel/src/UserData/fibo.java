package UserData;

import java.util.Scanner;

public class fibo {
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the count numer");
		Scanner a=new Scanner(System.in);
		count=a.nextInt();
		
		int n1=0,n2=1,n3,n;
		for(int i=0;i<count;i++) {
			n3=n1+n2;
			n=n3;
			System.out.println(n);
			n1=n2;
			n2=n3;
				
		}
	}

}
