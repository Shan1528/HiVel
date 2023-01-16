package UserData;
import java.util.*;


public class re {
public static void main(String [] args) {
	String str="Shan Vel";
	String vel[]=str.split(" ");
	StringBuilder br=new StringBuilder();
	for(int i=vel.length-1;i<0;i--) {
		if(i==vel.length-1) {
			br.append(vel[i]+" ");
		}
		else {
			br.append(vel[i]);
		}
	}
	br.reverse();
	System.out.println(br);
		
	}
}
	
