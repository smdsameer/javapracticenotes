package Generic;

import java.util.PriorityQueue;

public class lab658 {

	public static void main(String[] args) {
	int [] values= {1,2,3,4,5};
	int len=values.length;
	PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
	for(int x: values) {
		pq1.offer(x);
	}
System.out.println(pq1);
for(int i=0;i<len;i++)
	System.out.println(pq1.poll()+"");
System.out.println("Strings");
String nms[]= {"sam","hasan","gani","kabeer","lal"};
int len2=nms.length;
PriorityQueue<String> pq2=new PriorityQueue<String>();
for(String x:nms)
	pq2.offer(x);
System.out.println(pq2);
for(int i=0;i<len2;i++)
	System.out.println(pq2.poll()+"");
	}

}
