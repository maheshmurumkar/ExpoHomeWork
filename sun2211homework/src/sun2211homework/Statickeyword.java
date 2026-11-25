package sun2211homework;

public class Statickeyword extends Objcount {
	static int no = 100;
int num = 200;
	static {
	System.out.println("static method");
		Statickeyword sk = new Statickeyword();
		sk.no = 120;
		System.out.println(sk.no);
		
		System.out.println(sk.num);
		sk.num=210;
		System.out.println(sk.num);
	}
	
	static void m1() {
		
		System.out.println("static method calling without creating object");
	}

	{
		System.out.println("non static");
	}
	
	//void m2() {
//   System.out.println("cant override final");	
	//}
	
	public static void main(String[] args) {
		System.out.println(no);
		Statickeyword.no = 140;
		System.out.println(Statickeyword.no);
		
		Statickeyword sk1 = new Statickeyword();
		sk1.no=180;
		System.out.println(sk1.no);
		Statickeyword.m1();
		System.out.println(sk1.num);//diff in static and instance variable
	
	
	}
	

}
