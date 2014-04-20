
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
	public void fizz()
	{
		
		 for (int i = 0 ; i < a.length ; i++)
		 {
			 if(i%3 == 0)
			{
			 a[i] = "fizz";
			}
		 }
		
		
	}
	public void buzz()
	{
		
		 for (int i = 0 ; i < a.length ; i++)
		 {
			 if(i%5 == 0)
			{
			 a[i] = "buzz";
			}
		 }
		
		
	}
	public void fizzandbuzz()
	{
		
		 for (int i = 0 ; i < a.length ; i++)
		 {
			 if(i%5 == 0 && i%3 == 0)
			{
			 a[i] = "fizzbuzz";
			}
		 }
				
	}
}
