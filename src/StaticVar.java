
public class StaticVar {
	
//Instance variables	
	String name;
	String Address;
	static String city="Banglore"; //Class variables
	static int i =0;
	
//	Defining a constructor
//	These are called local  variables
	public StaticVar(String name, String Address)
	{
		this.name=name;
		this.Address=Address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress() {
		System.out.println(Address+" "+city);	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("rama","rr nagar");
		StaticVar obj1 = new StaticVar("Shama","jp nagar");
		obj.getAddress();
		obj1.getAddress();
//		If we want to access the static methods or static variables in the class, then
		StaticVar.city="Mysore";
		
		
	}

}
