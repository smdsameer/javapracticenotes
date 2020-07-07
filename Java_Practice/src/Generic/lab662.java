package Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class lab662 {

	public static void main(String[] args) {
List list= new ArrayList();
list.add("janu"); list.add("anees");
list.add("farhat"); list.add("Farhat");
list.add("parveen");
System.out.println(list);
System.out.println("\n Enumeration start");
Enumeration enm=Collections.enumeration(list);
Vector v= new Vector();
v.add("yasmeen");v.add("Weds"); v.add("mohaseen");
System.out.println("\n Enumeration to List");
Enumeration enu=v.elements();
List info=Collections.list(enu);
System.out.println(info);
	}

}
