package staticfinal3540;

public class objcount {

	static int count=0;
	
	objcount(){
		count++;
	}
	
	public static void main(String[] args) {
		objcount oc1 = new objcount();
		objcount oc2 = new objcount();
		objcount oc3 = new objcount();
		objcount oc4 = new objcount();
		objcount oc5 = new objcount();
		System.out.println("the object count is : "+count);

	}

}
