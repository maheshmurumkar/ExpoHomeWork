package sun2211homework;

public class Objcount //extends Finalclass //cant extend final class
{

	static int count=0;
	final int num;
	
	Objcount(){
		num=100;
		//num=120;
		count++;
		System.out.println("Contructor block calling");
	}
	
	{
		System.out.println("non static block calling");
	}
	
	static{
		System.out.println("static block calling");
	}
	
	final void m2() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		Objcount oc = new Objcount();
		Objcount oc1 = new Objcount();
		Objcount oc2 = new Objcount();
		Objcount oc3 = new Objcount();
		Objcount oc4 = new Objcount();
	System.out.println(count);
	//oc.num=123;
	}

}
