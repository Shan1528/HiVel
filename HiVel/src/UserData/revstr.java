package UserData;

public class revstr {
public static void main(String [] args) {
	String s="Hi vel";
	for(String se: s.split(" ")) {
		System.out.print(new StringBuilder(se).reverse()+ " ");
	}
}
}
