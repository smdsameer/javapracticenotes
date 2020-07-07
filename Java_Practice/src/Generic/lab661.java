package Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab661 {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("sam");list.add("naz");
	list.add("anira");list.add("ameena");
	System.out.println(list);
	List list2=new ArrayList();
	list2.add("faizah"); list2.add("nazia");
	list2.add("anam");
	System.out.println("list2 :"+list2);
	Collections.copy(list2, list);
	System.out.println("list2 :"+list2);
}
}
