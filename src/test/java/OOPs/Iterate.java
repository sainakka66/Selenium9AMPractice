package OOPs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterate {

	public static void main(String[] args) 
	{
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		// for each loop:
		for (String fruit: fruits)
		{
			System.out.println(fruit);
		}
		
		
		// For loop:
		for (int i=0; i<fruits.size(); i++)
		{
			System.out.println("Fruits is: " + i + " " + fruits.get(i));
		}
		
		//Using iterator:
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
