package Javapractice;

public class Constructors {
	Constructors(int a){//constructors used to assign a value to variables

		System.out.println(a);

	}

	public void test(int b) {

		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		Constructors demo=new Constructors(10);

		demo.test(25);


	}

}
