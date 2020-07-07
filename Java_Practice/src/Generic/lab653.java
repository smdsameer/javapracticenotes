package Generic;

import java.util.ArrayList;
import java.util.List;

public class lab653 {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(454545444); al.add(877574747);
al.add(432189);
showElement(al);
ArrayList<Float> Al=new ArrayList<Float>();
Al.add(44.56f); Al.add(89.34f);
Al.add(54.56f);
showElement(Al);
ArrayList<String> list=new ArrayList<String>();

}
	static void showElement(List<?extends Number>list) {
		for(Number num:list) {
			System.out.print(num+",");
		}
		System.out.println("\n");
	}

}
