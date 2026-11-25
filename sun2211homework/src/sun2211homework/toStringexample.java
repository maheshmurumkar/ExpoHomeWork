package sun2211homework;

public class toStringexample {
	String name="Mahesh";
	String clg="K.kwagh";
	char grade='A';
	double pack=15d;
	
	@Override
	public String toString() {
		return "toStringexample [name=" + name + ", clg=" + clg + ", grade=" + grade + ", pack=" + pack + "]";
	}

	public static void main(String[] args) {
		
		toStringexample ts =new toStringexample();
		System.out.println(ts);

	}

	

}
