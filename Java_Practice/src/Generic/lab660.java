package Generic;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab660 {

	public static void main(String[] args) {
Queue<String> que=new PriorityQueue<String>();
que.add("sam");
que.add("ghai");
que.add("zelan");
int len=que.size();
for(int i=0;i<len();i++) {
	System.out.println(que.poll());
}
System.out.println("\n*******");

Queue<String> que2=new PriorityQueue<String>(10,new PSort());
que2.add("hai");
que2.add("bye"); que2.add("Hello");
int len2=que2.size();
for(int i=0;i<len2();i++) {
	System.out.println(que2.poll());
}

	}
class PSort implements Comparator<String>{
	public int compare(String in1,String in2) {
		return in2.compareTo(in1);
	}
}
}
