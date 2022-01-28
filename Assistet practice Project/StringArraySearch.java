package java214;
public class StringArraySearch 
{  
        public static void main(String[] args)
        {  
            String[] strArray = { "Hi","welcome","to","company"};
            
          //initializing x to false 
            
            boolean x = false;
            
            //declaration of index variable 
            
            int a= 0; 
            
            // String to be searched
            
            String s = "Company"; 
            
            // Iteration of the String Array  
            
            for (int i = 0; i < strArray.length; i++)
            {  
                if(s.equals(strArray[i]))
                {  
                    a= i; x = true; 
                    break;  
                }  
            }  
            if(x)  
                System.out.println(s +" String is  at index "+a);  
            else  
                System.out.println(s +" String is not in the array");  
        }  
}  