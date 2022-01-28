package java214;

	public class Constructor
	{
	    float lenght;
	    float breath;
	   
	    Constructor() 
	    {
		System.out.println("Constructor without parameter");
		lenght = 10;
		breath = 10;
		
	    }
	    Constructor(int a, int b, int c) 
	    {
		System.out.println("Constructor with parameter");
		lenght = a;
		breath = b;
		
	    }
	    float area() 
	    {
		return lenght*breath;
		
	    }
	}
	class Constructor1
	{
	    public static void main(String args[]) 
	    
	    {
		Constructor rectangle = new Constructor();
	        float area;
	        
		area = rectangle.area();
		
		System.out.println("area is " + area);
		
		Constructor rectangle2 = new Constructor();
		
		area = rectangle2.area();
		
		System.out.println("area is " + area);
	    }
	}
	
	