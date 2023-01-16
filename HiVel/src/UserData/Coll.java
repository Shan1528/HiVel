package UserData;
import java.util.*;
public class Coll {
	public static void main (String []args) {
	List<Integer>id=new ArrayList<>();
	id.add(10);
	id.add(9);
	id.add(8);
	Collections.sort(id);
	for(int o:id) {
		System.out.println(o);
	}
	List<String>h=new ArrayList<>();
	h.add("Hi Shan");
	h.add("Ai nantha");
	
	Collections.sort(h);
	for(String hi:h) {
		System.out.println(hi);
	}
	
	}
	

}
