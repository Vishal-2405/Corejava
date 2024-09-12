package abstraction;

public abstract  class parentAircraftRules {
//	This is the class without any body & just with a signature
//	It's a class's responsibility to implement this method "color",so named as public abstract void color();
//	If a class contains a single abstract method, then that class will also be treated as an abstract class only.
//	While implementing the abstract method in a class we use the keyword called "extends".
	public abstract void color();

	public void Engine()
	{
		System.out.println("Engine");
		
	}
	public void gear()
	{
		System.out.println("gear");
		
	}
	public void handle()
	{
		System.out.println("Handle");
		
	}
	
	
}
