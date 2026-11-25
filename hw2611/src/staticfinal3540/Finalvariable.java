package staticfinal3540;

public class Finalvariable {
final int id=20;//have to assign value at declaration


final void m1() {
	System.out.println("cant override final method");
}
	public static void main(String[] args) {
		Finalvariable fv = new Finalvariable();
		//fv.id=50;//cant change
fv.m1();
	}

}
