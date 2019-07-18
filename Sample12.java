

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Sample12 {

	public static void main(String[] args) {
		Map<Integer,String> mp=new LinkedHashMap<Integer, String>();
		mp.put(10, "10");
		mp.put(20, "20");
		mp.put(30, "30");
		mp.put(40, "40");
		mp.put(50, "50");
		mp.put(60, "60");
		mp.put(10, "10");
		mp.put(50, "50");
		mp.put(40, "40");
		System.out.println(mp);
		// To print the key
		Set<Integer> key = mp.keySet();
		System.out.println(key);
		// To print the value only
		Collection<String> val = mp.values();
		System.out.println(val);
	}

}


