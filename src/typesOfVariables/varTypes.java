package typesOfVariables;

public class varTypes {
//	Below are the instance variables, these are declared outside of any methods/constructor/block but inside of class
//	These instance variables can vary from object to object
//	we cannot access them in the static main method directly
//	We need to create an object of class to access in the main method
//	But we can access them in the other methods created in the class without creating the object 
	int rollno;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varTypes v= new varTypes();
		System.out.println(v.name);
	}
	public void method()
	{
		System.out.println(name);
		System.out.println(rollno);
	}

}
