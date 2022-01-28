package java214;

public class Returntype 
{ 
//  method with return type integer. 
	
  String return1()
  { 
   System.out.println("return1 method"); 
   
      return "Welcome"; 
} 

  String return2() 
  { 
    System.out.println("return2 method"); 
      return "to company"; 
  } 
  static String return3()
  { 
    System.out.println("return3 method"); 
     return "new"; 
  } 
public static void main(String[] args)
 { 
	
    Returntype s = new Returntype();
  
      String x = s.return1(); 
      
// print the return value. 
      
    System.out.println("Return value of return1()= " +x); 

    String y = s.return2();
    System.out.println("Return value of return2()= " +y); 


    String hi = Returntype.return3(); 
    System.out.println("Return value of return3()= " +hi); 
  } 
 }
