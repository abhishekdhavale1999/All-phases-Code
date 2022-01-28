package java214;
public class UseOfAccessmodifier
{
	// Two access mOdifiers are used PRIVATE and PUBLIC
		    private String name;

		    // getter method
		    public String getName()
		    {
		        return this.name;
		    }
		    // setter method
		    public void setName(String name) 
		    {
		        this.name= name;
		    }
		
		    public static void main(String[] main)
		    {
		    	UseOfAccessmodifier a = new UseOfAccessmodifier();
		    	
		        a.setName("Abhishek");
		        
		        System.out.println(a.getName());
		    }
		
	}