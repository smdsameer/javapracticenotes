package Generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab650 {

	public static void main(String[] args) {
Set <String> set=new HashSet<String>();
set.add("nazia");set.add("sameer");set.add("ameena Faiza");
set.add("anira anaam");
Iterator it=set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}}}
