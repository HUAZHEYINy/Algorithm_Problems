package No_70_Climbing_Stairs;

public class Solutions {
	public static void main(String[] args){
		System.out.println(climbStairs(3));
	}
	
	public static int climbStairs(int n){
		int [] list =  new int[n+1];
		if(n == 1) return 1;
		if(n == 2) return 2;
		list[0] = 1;
		list[1] = 2;
		for(int i = 2; i <= n; i++){
			list[i] = list[i-1] + list[i-2];
		}
		return list[n-1];
	}

}
