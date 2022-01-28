package java214;

import java.util.Scanner;
public class ArithmeticCalculator

{
 public static void main(String[] args)
 {
   char operator;
   float number1, number2,ans= 0;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter first number");
   number1 = input.nextFloat();

   System.out.println("Enter second number");
   number2 = input.nextFloat();   
   
   System.out.println("select an operator: +, -, *, or /");
   operator = input.next().charAt(0);

   switch (operator) 
   {

     // addition
   
     case '+':
       ans = number1 + number2;
       System.out.println( ans);
       break;

     // subtraction
       
     case '-':
       ans = number1 - number2;
       System.out.println( ans);
       break;

     // multiply
       
     case '*':
       ans = number1 * number2;
       System.out.println( ans);
       break;

     //  division
       
     case '/':
       ans = number1 / number2;
       System.out.println(ans);
       break;

     default:
   	  
       System.out.println("Invalid operator!");
       break;
   }
   
   System.out.println("ans is "  +ans);
   
   input.close();
 }
 
}