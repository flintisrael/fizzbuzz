import static org.junit.Assert.*;

import org.junit.Test;


public class fizzbuzztest {

	
	fizzbuzz fizz = new fizzbuzz();
	@Test
	public void testinit() {
		for (int i = 0 ; i < 100 ; i++)
		{	
			if (fizz.a[i].equals(i))
			{
				fail("error");
			}
		}
	}

}
