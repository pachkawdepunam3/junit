package com.BikkadIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalculater 
{
	public static  Calculater  calculater=null;
	@BeforeAll
	public static void init()
	{
		calculater =new Calculater();
		
	}
	@AfterAll
	public static void destroy()
	{
		calculater=null;
	}
	
			
  @Test
  public void testSum()
  {
	  //Calculater calculater=new Calculater();
	  int actualresult=calculater.sum(10,20);
	  int expectedresult =30;
	  assertEquals(expectedresult, actualresult);
	  
  }
  @Test
  public  void testSub()
  {
	 // Calculater calculater=new Calculater();
	  int actualresult=calculater.sub(20,10);
	  int exceptedresult=10;
	  assertEquals(exceptedresult, actualresult);
	  
  }
  @Test
  public void testMul()
  {
	 // Calculater calculater=new Calculater();
	  int actualresult=calculater.mul(2,2);
	  int exceptedresult=4;
	  assertEquals(exceptedresult, actualresult);
  }
   @Test
   public void testDiv()
   {
	   //Calculater calculater=new Calculater();
	   int actualresult=calculater.div(50, 10);
	   int exceptedresult=2;
	   
   }
}
