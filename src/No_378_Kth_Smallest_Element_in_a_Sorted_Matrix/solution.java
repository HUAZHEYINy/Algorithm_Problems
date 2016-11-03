package No_378_Kth_Smallest_Element_in_a_Sorted_Matrix;
import java.util.*;

public class solution {
	public static void main (String[] args) {
		int[][] matrix = {
				{1, 5, 9,},
				{10, 11, 13},
				{12, 13, 15}
				};
		
		System.out.println(kthSmallest(matrix, 8));
		Comparator<Integer> cmp = new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2){
				return o1 - o2;
			}
		};
		
		PriorityQueue<Integer> d = new PriorityQueue<Integer> (new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
	}
	/**
	matrix = [
   				[ 1,  5,  9],
   				[10, 11, 13],
   				[12, 13, 15]
			],
			k = 8,

			return 13.
	 * 
	 * 
	 * */
	public static int kthSmallest (int[][] matrix, int k) {
		PriorityQueue<Tuple> queue = new PriorityQueue<Tuple> ();
		
		for (int i = 0; i < matrix[0].length; i++) {
			queue.offer(new Tuple(0, i, matrix[0][i]));
		}
		for (int i = 0; i < k - 1; i ++) {
			Tuple t = queue.poll();
			
			//reach the last row
			if (t.x == matrix.length - 1) {
				continue;
			} 
			queue.offer(new Tuple(t.x+1, t.y, matrix[t.x+1][t.y]));
		}
		
		return queue.poll().value;
	}

}

class Tuple implements Comparable<Tuple>{
	int x;
	int y;
	int value;
	
	Tuple(int x, int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	@Override
	public int compareTo(Tuple that) {
		return this.value - that.value;
	}
	
}
