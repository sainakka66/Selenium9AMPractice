package OOPs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) 
	{
		
		//List:
		List<String> names = new ArrayList<>();
		System.out.println(names.add("Sai"));

		List<Integer> numbers = new ArrayList<>();
		System.out.println(numbers.add(100));
		
		List<Float> floats = new ArrayList<>();
		System.out.println(floats.add(21.089f));

		List<Character> charc = new ArrayList<>();
		System.out.println(charc.add('s'));
		
		
		//Map:
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Sai");
		students.put(2, "Nakka");
		System.out.println(students);
		Map<Float, Character> student = new HashMap<>();
		student.put(1.09f, 'S');
		student.put(2.50f, 'N');
		System.out.println(student);
		
		
	}

}
