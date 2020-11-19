import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		
		System.out.println("Original HashSet: " + hs);   
		System.out.println("The size if the hashset is: " + hs.size());
		hs.remove("C");
		
		if (hs.remove("X")) {
			System.out.println("Elexment X is removed");
		}
		else {
			System.out.println("Element X is not present in the Hashset");
		}
			
		if (hs.contains("F")) {
			System.out.println("Element F is present in the set");
		}
		else {
			System.out.println("Element F is not present in the set");
		}
		
		System.out.println("Element in the current set are: " + hs);
	}

}
