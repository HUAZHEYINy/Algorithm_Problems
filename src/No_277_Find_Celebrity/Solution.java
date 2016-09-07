package No_277_Find_Celebrity;

public class Solution extends Relation{
	public static void main(String[] args){
		
	}
	
	public static int findCelebrity(int n){
		int index = 0;
		//if index knows i; so index can not be celebrity
		//and i may be celebrity.
		for(int i = 1; i < n; i++){
			if(knows(index,i)) index = i;
		}
		
		for(int i = 0; i < n; i++){
			if(i != index && (!knows(i,index) || knows(index,i))) return -1;
		}
		return index;
		
	}

}
