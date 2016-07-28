package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;




public class Collections 
{
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	ArrayList<Integer> numbers2 = new ArrayList<Integer>();
	ArrayList<Integer> numbers3 = new ArrayList<Integer>();
	
	
	public ArrayList collection1()
	{
		
		Random rand = new Random();
		for(int i = 0;;i++)
		{
			int  n = rand.nextInt(10) + 1;
			if(numbers.contains(n) == false)
			{
				numbers.add(n);			
			}
			
		
			if(numbers.size() == 10)
				break;
		
			
		}
	
		
		System.out.println("Size:" + numbers.size());
		

		
	return numbers;
	}
	

	public void getValues_collection1()
	{
		
		for(int index = 0; index < numbers.size(); index++)
		{
			int retrievedValue = numbers.get(index);
			System.out.println("Value: " + retrievedValue);
		}
		
	}

	
	
	public ArrayList collection2()
	{
		
		Random rand_var2 = new Random();
		for(int a = 0;;a++)
		{
			int  n_var2 = rand_var2.nextInt(10) + 6;
			
			if(numbers2.contains(n_var2) == false)
			{
				numbers2.add(n_var2);			
			}
			
		
			if(numbers2.size() == 10)
				break;
		
			
		}
	
		
		System.out.println("Size Collection 2:" + numbers2.size());
		

		
	return numbers2;
	}
	
	
	public void getValues_collection2()
	{
		
		for(int index2 = 0; index2 < numbers2.size(); index2++)
		{
			int retrievedValue_var2 = numbers2.get(index2);
			System.out.println("Value_2ndCollection: " + retrievedValue_var2);
		}
		
	}	
	
	
	public ArrayList collection3()
	{	
		
		for(int index_var2 = 0; index_var2 < numbers.size(); index_var2++)
		{
			int retrievedValue_var3 = numbers.get(index_var2);
			if(numbers3.contains(retrievedValue_var3) == false)
				numbers3.add(retrievedValue_var3);
			
		}
		
		for(int index2_var2 = 0; index2_var2 < numbers2.size(); index2_var2++)
		{
				
			int retrievedValue_var4 = numbers2.get(index2_var2);
			if(numbers3.contains(retrievedValue_var4) == false)
				numbers3.add(retrievedValue_var4);
			
		}
		
		
		java.util.Collections.sort(numbers3);
		
		int index_removeElement = numbers3.size();
		int middleIndexValue = (index_removeElement/2) - 1; 
		System.out.println("Index to remove at: " + middleIndexValue);
		numbers3.remove(middleIndexValue);
		
		
		
		
		for(int b = numbers3.size() - 1; b >= 0; b--)
		{
			int retrievedValue_numbers3 = numbers3.get(b);
			System.out.println("Value_3rdCollection: " + retrievedValue_numbers3);
		}
		
	
		System.out.println("Size 3rd Collection: " + numbers3.size());		
	
		return numbers3;
	
	}
	
	
	public void collection4()
	{
		
// In a Map can only contain unique keys which are mapped to values.
// That's why I inserted the unique keys in an ArrayList. I also inserted the corresponding values in an ArrayList. 		
// The first ArrayList was inserted as a key in the HashMap. The second ArrayList was inserted as a value in the HashMap. 
// Adding the keys and values in an ArrayList allows me to insert duplicate keys into the HashMap.		
		Map<List<Integer>,List<String>> map = new HashMap<List<Integer>,List<String>>();
		
		List<Integer> keys = new ArrayList<Integer>();
		keys.add(1);
		keys.add(2);
		keys.add(3);
		keys.add(4);
		keys.add(5);
		keys.add(1);
		
		
		
		List<String> values = new ArrayList<String>();
		values.add("Amanda");
		values.add("Jessica");
		values.add("Rebecca");
		values.add("Peter");
		values.add("John");
		values.add("Amanda");
		
		
		for(int x = 0; x < keys.size(); x++)
		{
			for(int y = 0; y < keys.size(); y++)
			{
				if(keys.get(x).equals(keys.get(y)))
					{
						System.out.println("Duplicate at index: " + x);
						System.out.println("The duplicate pair is: " + keys.get(x) + ", " + values.get(x));
					}	
				
			}
				
		}
		
		
		
		
		map.put(keys, values);
		
		System.out.println(map.keySet().toString());
		System.out.println(map.values().toString());
		System.out.println("map:"+map.toString());

		
		
		
		int size_Map = map.size();
		System.out.println("Size of 4th collection: " + size_Map);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		Collections collections = new Collections();
		collections.collection1();
		collections.getValues_collection1();
		System.out.println("    ");
		
		collections.collection2();
		collections.getValues_collection2();
		System.out.println("    ");
		collections.collection3();
		
		System.out.println("    ");
		System.out.println("Collection 4");
		collections.collection4();
	
	
	}


	



}
