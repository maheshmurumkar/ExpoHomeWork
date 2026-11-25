package staticfinal3540;

public class staticvsintancevariable {

	static int rollnu=15;
	int id=20;
	
	public static void main(String[] args) {
		
		System.out.println(rollnu);//directly called static method without class or object in static block

		staticvsintancevariable si = new staticvsintancevariable();
		System.out.println(si.id);
		
	}

}
