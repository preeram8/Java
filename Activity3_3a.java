	
import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		
		for (int i=0; i<5; i++) {
			q.add(i);
		}
		
		System.out.println("The values of the Q are: " + q);
		int F = q.remove();
		System.out.println("The removed element is: " +F);
		int p = q.peek();
		System.out.println("The peeked element is: " + p);
		
		System.out.println("The current size of the queue is: " + q.size());
		
		System.out.println("The elements of the Q are: " +q);
		
	}

}
