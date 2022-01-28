package java214;

import java.util.*;
public class Maps 
{

	public static void main(String[] args) 
	{
		
		//Hashmap
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"welcome");    
	      hm.put(2,"to");    
	       
	      System.out.println("\nThe elements of Hashmap are "); 
	      
	      for(Map.Entry m:hm.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"New");  
	      ht.put(5,"company");  

	      System.out.println("\nThe elements of HashTable are "); 
	      
	      for(Map.Entry n:ht.entrySet())
         {    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Abhi");           
	      
	      System.out.println("\nThe elements of TreeMap are ");
	      
	      for(Map.Entry l:map.entrySet())
	      {    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}



