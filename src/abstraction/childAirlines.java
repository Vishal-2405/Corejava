package abstraction;

public class childAirlines extends parentAircraftRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childAirlines a = new childAirlines();
		a.Engine();
		a.gear();
		a.handle();
		a.color();
	}

	
//	This is the abstract method which is defined in the parentAircraftRules class
	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

}
