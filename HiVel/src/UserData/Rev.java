package UserData;

public class Rev {
	public static void main(String []args) {
	String str="Welcome Shan";
	int i=0,j=str.length()-1;
	char[] revstr=new char[j+1];
    while(i<j) {
    	revstr[j]=str.charAt(i);
    	revstr[i]=str.charAt(j);
    	i++;
    	j--;
    }
    System.out.println("Reversed String = "+String.valueOf(revstr));
    	
    }
}
