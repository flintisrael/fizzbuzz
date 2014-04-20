
public class fizzbuzz {

	public String a[];
	public fizzbuzz()
	{
		 a= new String [100];
		
	}
	public void init()
	{
		
		 for (int i = 0 ; i < a.length ; i++)
		 {
			 a[i] = Integer.toString(i);
		 }
	}
}
