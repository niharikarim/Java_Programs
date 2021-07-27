package collections;



import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class CopyArray {
	public static void main(String[] arrgs) {
		
		// Creating an empty ArrayList
        ArrayList<String> list
            = new ArrayList<String>();
  
        // Use add() method
        // to add elements in the list
        list.add("Niharika");
        list.add("for");
        list.add("Srivastava");
        list.add("10");
        list.add("20");
  
        // Displaying the list
        System.out.println("First ArrayList: "
                + list);

// Creating another linked list and copying
ArrayList sec_list = new ArrayList();
sec_list = (ArrayList)list.clone();

// Displaying the other linked list
System.out.println("Second ArrayList is: "
                + sec_list);
		
		
		
	}

}
