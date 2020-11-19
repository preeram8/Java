import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String> ();
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Banana");
		myList.add(3, "Grapes");
		myList.add(1, "chiku");
		
		System.out.println("List of all the fruits are");
		for (String S:myList) {
			System.out.println(S);
		}
		
		System.out.println("List of fruits in the ArrayList are: " + myList.get(2));
		System.out.println("The list contains: " + myList.contains("Orange"));
		System.out.println("The size of the list is: " + myList.size());
		 
		myList.remove(4);
		System.out.println("The size of the current list is: " + myList.size());
	}

}
