package OOPs;

import java.util.LinkedList;
import java.util.Queue;

public class Test6 {

	public static void main(String[] args) 
	{
		
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println(tasks.poll()); // removes Task 1
        System.out.println(tasks.peek()); // sees Task 2
		
	}

}
