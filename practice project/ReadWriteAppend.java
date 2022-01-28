import java.io.FileReader;
import java.io.FileWriter;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;

import java.util.Scanner;
public class ReadWriteAppend
{
    public static void main(String args[])  
    {
        System.out.println("Please select one of the below");
        System.out.println(" W for write ");
        System.out.println(" R for read ");
        System.out.println(" A for append ");
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        if(s.equalsIgnoreCase("R"))
        {
            new Reading();
        }
        else if(s.equalsIgnoreCase("W")||s.equalsIgnoreCase("A"))
        {
            writingToFile(s);
        }
        in.close();
        
    }
    
    public static void writingToFile(String s)
    {
        Scanner in=null;
        try
        {
            String source = "";
            File f=new File("file.txt");
            
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            
            //For writing new Content Everytime you run
            
            FileWriter f0 =null;
            if(s.equalsIgnoreCase("W"))
            {
                f0 = new FileWriter(f,false);
                in=new Scanner(System.in);
        
                System.out.println("Write 'stop' when you finish writing. ");
                f.delete();
                f.createNewFile();
                while(!(source=bf.readLine()).equalsIgnoreCase("stop"))
                {
                    f0.write(source + System.getProperty("line.separator"));
                    
                }
                
                in.close();
            }
            
            //For appending the content
            
            else
            {  f0 = new FileWriter(f,true);
                System.out.println("Write 'ok' when you finish appending file ");
                
                while(!(source=bf.readLine()).equalsIgnoreCase("ok"))
                {
                    f0.append(source+ System.getProperty("line.separator"));
                }
            }
            f0.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }
}

class Reading {
    public static String str="";
    
    public Reading() 
    {
        try{
          
          File f5=new File("file.txt");
            if(! f5.exists())
            f5.createNewFile();
            FileReader fl=new FileReader(f5);
            BufferedReader bf=new BufferedReader(fl);
            
            //For reading till end
            
            while((str=bf.readLine())!=null)
            {
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e)
        {
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }
}