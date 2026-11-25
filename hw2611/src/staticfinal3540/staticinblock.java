package staticfinal3540;

public class staticinblock {
	static int rollnu;
	
	static {
		rollnu=25;
		System.out.println(rollnu);
		System.out.println("static block called");
	}
	
	staticinblock(){
		System.out.println(rollnu);
		System.out.println("object called");
	}
	

	public static void main(String[] args) {
		staticinblock si = new staticinblock();
		
	}

}
