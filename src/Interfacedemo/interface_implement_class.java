package Interfacedemo;

public class interface_implement_class implements interface_1,interface_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		If i want to access the methods of interface_1, create an object of interface_1 pointing to interface_implement_class

		interface_1 a = new interface_implement_class();
		a.function_1();
		a.function_11();
		a.function_111();
		
//		If i want to access the methods of interface_2, create an object of interface_2 pointing to interface_implement_class
		interface_2 b = new interface_implement_class();
		b.function_2();
		b.function_22();
		b.function_222();
	}

	@Override
	public void function_2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function_22() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function_222() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function_11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void function_111() {
		// TODO Auto-generated method stub
		
	}

}
