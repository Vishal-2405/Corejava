package constructors;

import org.testng.annotations.Test;

public class constructors1 {
	
	@Test
	public void ex()
	{
		int a= 5;
//		Now i want to pass this value of "a" which is 5 to the methods present in constructors2 class to execute.
//		create object of constructors2 class
		constructors2 c = new constructors2(a);
		
		System.out.println(	c.increment());
		System.out.println(c.decrement());
		
	}
	
}
