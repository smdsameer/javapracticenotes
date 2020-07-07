package Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class lab651 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Shaheen"); map.put(2, "Parveen");
		map.put(3, "farhat"); map.put(4, "Janu");
		map.put(5, "Anees");
		Set<Map.Entry<Integer,String>> set= map.entrySet();
		Iterator<Map.Entry<Integer,String>> it2=set.iterator();
		while(it2.hasNext()) {
			Map.Entry<Integer, String> entry=it2.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"\t"+value);
		}
		

	}

}
