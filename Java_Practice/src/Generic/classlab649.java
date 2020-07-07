package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class classlab649 {

	public static void main(String[] args) {
System.out.println(">-> using list with generic<-<");
List<String> list=new ArrayList<String>();
list.add("sabera"); list.add("kareem");list.add("anees");
list.add("masood");list.add("Anwar");
Iterator it=list.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
	}

}
