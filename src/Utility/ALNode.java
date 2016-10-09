package Utility;

public class ALNode {
	int value;
	ALNode next;
	ALNode arbitrary;
	ALNode (int val) {
		this.value = val;
	}
	/**
	 *      |----|
	 *      |    ~
	 * 1 -> 2 -> 3 -> 4 -> 5 -> null
	 * |    ~    |    ~
	 * |----|    |----|
	 * 
	 * */
	public static ALNode initialize () {
		ALNode[] nodes = new ALNode[5];
		
		for (int i = 1; i <= 5; i++) {
			nodes[i-1] = new ALNode(i);
		}
		
		for (int i = 0; i < 4; i++) {
			if (i != 3) {
				nodes[i].next = nodes[i+1];
				nodes[i].arbitrary = nodes[i+1];
				continue;
			}
			nodes[i].next = nodes[i+1];
		}
		
		return nodes[0];
	}
	
	public static void printALNode (ALNode head) {
		ALNode temp = head;
		while(temp != null) {
			System.out.print(temp.value);
			if (temp.next != null) {
				System.out.print(" ==> ");
			}
			temp = temp.next;
		}
		
		System.out.println("\n\n Arbitary List:\n");
		ALNode temp1 = head;
		while (temp1 != null && temp1.arbitrary != null) {
			System.out.println(temp1.value +" 's arbitary value : "+temp1.arbitrary.value);
			temp1 = temp1.next;
		}
	}

}
