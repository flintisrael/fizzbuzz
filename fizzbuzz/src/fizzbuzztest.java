import static org.junit.Assert.*;

import org.junit.Test;


public class fizzbuzztest {

	
	fizzbuzz fizz = new fizzbuzz();
	@Test
	public void testinit() {
		fizz.init();
		for (int i = 0 ; i < 100 ; i++)
		{	
			if (fizz.a[i].equals(i))
			{
				fail("error");
			}
		}
	

	}
	@Test
	public void testfiz()
	{
		fizz.fizz();
		for (int i = 0 ; i < 100 ; i++)
		{	
			if(i%3 == 0)
			{
				if (!fizz.a[i].equals("fizz"))
				{
					fail("errorfizz");
				}
			}
		}
		
	}
	@Test
	public void testbuzz()
	{
		fizz.buzz();
		for (int i = 0 ; i < 100 ; i++)
		{	
			if(i%5 == 0)
			{
				if (!fizz.a[i].equals("buzz"))
				{
					fail("errorbuzz");
				}
			}
		}
		
	}
	@Test
	public void testfizzbuzz()
	{

		fizz.fizzandbuzz();
		for (int i = 0 ; i < 100 ; i++)
		{	
			if(i%5 == 0 && i%3 == 0)
			{
				if (!fizz.a[i].equals("fizzbuzz"))
				{
					fail("errorfizzbuzz");
				}
			}
		}
		
	}
	@Test
	public void testfizzandbuzz()
	{
		fizz.init();
		fizz.fizz();
		fizz.buzz();
		fizz.fizzandbuzz();
		for (int i = 0 ; i < 100 ; i++)
		{
			if(i%5 == 0 && i%3 == 0)
			{
				if (!fizz.a[i].equals("fizzbuzz"))
				{
					fail("errorfizzbuzz");
				}
			}
			else if(i%5 == 0)
			{
				if (!fizz.a[i].equals("buzz"))
				{
					fail("errorbuzz");
				}
			}
			else if(i%3 == 0)
			{
				if (!fizz.a[i].equals("fizz"))
				{
					fail("errorfizz");
				}
			}
			else
			{
				if (fizz.a[i].equals(i))
				{
					fail("error");
				}
				
			}
		}
	}
	
}
