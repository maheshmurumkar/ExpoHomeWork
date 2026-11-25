package staticfinal3540;

public class Instanceblock {
	int no ;
	static int rno=24;
	static{
		rno=26;
		System.out.println(rno);
	}
	
	{
		no=25;
		System.out.println(no);
		System.out.println("Instanceblock called");
	}
	
	Instanceblock(){
		System.out.println("contructor called");
		
	}

	public static void main(String[] args) {
		Instanceblock ib = new Instanceblock();
		

	}

}
