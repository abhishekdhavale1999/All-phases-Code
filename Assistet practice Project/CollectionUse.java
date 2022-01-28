package java214;

import java.util.Collection;
import java.util.LinkedList;

public class CollectionUse {
	
    public static void main(String args[])
    {
 
        // creating an empty LinkedList
    	
        Collection<String> list = new LinkedList<String>();
 
        // use add() method to add elements in the list
        
        list.add("welcome");
        list.add("to");
        list.add("company");
 
        // Output the present list
        
        System.out.println("The list is: " + list);
 
        // Adding new elements to the end
        
        list.add("Last");
        list.add("Element");
 
        // printing the new list
        
        System.out.println("The new List is: " + list);
    }
}

