package examples;
import java.util.*;

public class CollectionExample {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<>();
		int[] nums = {2, 3, 9, 17};
		
//		nums[nums.length] = 21;
		
//		ArrayList<Object> nums = new ArrayList<>();
		
		listOfNames.add("Nishant");
		listOfNames.add("Pooper");
		listOfNames.add("Woofer");
		listOfNames.add("Jumper");
		
		System.out.println(listOfNames.get(2));
		System.out.println(listOfNames);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
