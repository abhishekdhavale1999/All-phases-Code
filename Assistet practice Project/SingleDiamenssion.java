package java214;

public class SingleDiamenssion
{
public static void main(String[] args) 
{
// Declare and initialize an array of single Diamension array 
	
    int arr[] = {1,2,3,4,5,6}; 
    
   for (int i = 0; i < arr.length; i++)
	   
      System.out.println(arr[i] + " ");
 }

public class MultiDimensional
{
public static void main(String args[])
{
//MultiDiamenssion array a is declared and initialized
	
char a[][]={{'a','b'},{'c','d'},{'e','f'}};


for(char i=0;i<2;i++)
{
for(char j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

 }

   }
      }

