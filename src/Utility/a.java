package Utility;

public class a {
	a (){
		System.out.println("I am parent..");
	}
	public int overloadTest (int a) {
		return a;
	}
	
	public double overloadTest(double a) {
		return 1.0 * a;
	}
	
	public float overloadTest(float a){
		return a;
	}

}
