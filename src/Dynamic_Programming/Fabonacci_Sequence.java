package Dynamic_Programming;

public class Fabonacci_Sequence {
	public static void main(String[] args){
		System.out.println(recresive(7));
		int[][] fin ={{1,2,3},{1,2,3}};
		
		System.out.println(Integer.parseInt("1"));
	}
	
	public static int recresive(int n){

		if(n <= 1){
			return n;
		}
		return recresive(n-1) + recresive(n-2);
	}
}
