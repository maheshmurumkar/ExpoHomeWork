package staticfinal3540;

public class Blockorder {
	
	{
		System.out.println("instance block called");
	}
	
	static {
		System.out.println("static block called");
	}
	
	Blockorder(){
		System.out.println("constructor block called");
		
	}

	private void m1() {
		System.out.println("method block called");
	}
	public static void main(String[] args) {
	System.out.println("main get called");
	Blockorder bo = new Blockorder();
	bo.m1();
	
	
	}

}
