import java.util.*;

public class Activity3_3b {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<String>();

       
        dq.add("Ram");
        dq.add("Laxman");
        dq.add("Seetha");
        
        dq.add("Deer");
        dq.add("Peacok");
        dq.add("Ravan");
       
        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Peek at head element
        System.out.println("Peek: " + dq.peekFirst());
        System.out.println("Peek: " + dq.peekLast());
        //To show that the element have not been deleted
        System.out.println("After peek: " + dq);
        
        System.out.println("Contains Ram?: " + dq.contains("Ram"));
        System.out.println("Contains Preethy?: " + dq.contains("Preethy"));

        
        dq.removeFirst();
        dq.removeLast();
        System.out.println("dq after removing first and last elements: " + dq);
        System.out.println("Size of deque after removal: " + dq.size());
    }
}