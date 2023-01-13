package com.BikkadIT;

public class Calculater 
{
	
   public int sum(int a,int b)
   {
	   int c=a+b;
	   System.out.println("Additon of a and b" +c);
	   return c;
   }
   
   public int sub(int a, int b)
   {
	   int c=a-b;
	   System.out.println("Substraction of a and b" +c);
	   return c;
   }
   
   public int mul(int a, int b)
   {
	   int c=a*b;
	   System.out.println("Multiplication of a and b" +c);
	   return c;
   }
   
   public int div(int a, int b)
   {
	   int c=a/b;
	   System.out.println("Divition of a and b" +c);
	   return c;
   }
}
