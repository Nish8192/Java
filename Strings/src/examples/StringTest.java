package examples;

public class StringTest {
	public static void main(String[] args) {
		String strA = "Hello!";
		String strB = new String("Hello!");
		String strC = "Hello!";
		
		System.out.println("String A: " + strA);
		System.out.println("String B: " + strB);
		System.out.println("String C: " + strC);

		
		if(strA == strB) {
			System.out.println("String A and String B are equal in memory!");
		}
		if(strA.equals(strB)) {
			System.out.println("String A and String B are equal values!");
		}
		if(strA == strC) {
			System.out.println("String A and String C are equal in memory!");
		}
		
	}
}
