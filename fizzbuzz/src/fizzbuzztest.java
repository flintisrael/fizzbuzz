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
}
