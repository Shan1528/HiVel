package UserData;
import java .util.*;
public class Ma {
public static void main(String []args) {
	Map<String,Integer>map=new TreeMap<>();
	map.put("Roll no", 50);
	map.put("bench no", 1);
	map.put("Rank", 10);
	Set<String>hi=map.keySet();
	for(String h:hi) {
		System.out.println(h+" "+map.get(h));
	}
	System.out.println(map.get("Rank"));
}
	
}
