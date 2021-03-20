import java.util.*;
public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Array List");
		ArrayList<String> city = new ArrayList<>();
		ArrayList<Integer> pin = new ArrayList<>();
		city.add("Pune");
		city.add("Pune");
		pin.add(411021);
		pin.add(411021);
		System.out.println("Cities is:"+city+" and Pincode is:"+pin);
		
		//Vectors are synchronized; used in multi programming
		System.out.println("Using Vector");
		Vector<String> city1 = new Vector<>();
		Vector<Integer> pin1= new Vector<>();//"Integer" here is wrapper class for primitive data type "int"
		city1.add("Mumbai");
		city1.add("Mumbai");
		pin1.add(411001);
		pin1.add(411001);
		System.out.println("Cities is:"+city1+" and Pincode is:"+pin1);
		
		System.out.println("Using HashSet");
		HashSet<String> city2 = new HashSet<>();
		HashSet<Integer> pin2= new HashSet<>();//"Integer" here is wrapper class for primitive data type "int"
		city2.add("Mumbai");
		city2.add("Mumbai");
		city2.add("Pune");
		pin2.add(411001);
		pin2.add(411001);
		pin2.add(411021);
		System.out.println("Cities is:"+city2+" and Pincode is:"+pin2);
	}

}
