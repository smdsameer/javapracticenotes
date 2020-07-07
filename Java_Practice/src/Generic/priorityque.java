package Generic;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityque {

	public static void main(String[] args) {
Queue<String> que=new PriorityQueue();
que.add("Harish");
que.add("hari");
que.add("shabaz");
que.add("surya");
System.out.println(que);
System.out.println("size :"+que.size());
System.out.println("Peek :"+que.peek());
System.out.println("Size :"+que.size());
System.out.println("Element :"+que.element());
System.out.println("Size :"+que.size());
System.out.println("Poll :"+que.poll());
System.out.println("Size :"+que.size());

	}

}
