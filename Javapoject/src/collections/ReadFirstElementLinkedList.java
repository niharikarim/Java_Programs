package collections;

import java.util.LinkedList;

public class ReadFirstElementLinkedList {
	 public static void main(String a[]){
         
	        LinkedList<String> arrl = new LinkedList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("First Element: "+arrl.element());
	        System.out.println("First Element: "+arrl.getFirst());
	        System.out.println("First Element: "+arrl.peek());
	        System.out.println("First Element: "+arrl.peekFirst());

}
}
