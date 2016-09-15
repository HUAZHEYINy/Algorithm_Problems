package No_27_Remove_Element;

public class Solutions {
	public static void main(String[] args){
		int[] nums = {3,2,3,3,4,5,6,7};
		System.out.println("length: "+removeElement(nums,3));
		
	}
	
	public static int removeElement(int[] nums, int val){
		for(int i = 0; i < nums.length; i++){
			
			//find target value
			if(nums[i] == val){
				int nextNoVal = find(nums, i+1, val);
				nums[i] = nums[nextNoVal];
				nums[nextNoVal] = val;
			}else{
				continue;
			}
		}
		int length = 0;
		for(int i = 0 ; i < nums.length; i++){
			if(nums[i] != val){
				length++;
			}
			else
				break;
		}
		
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]+"  ");
		}
		return length;
	}
	//find the index of the element which value is not val
	//return 1. return the index of the value which is not equal to val
	//       2. return the last index 
	public static int find(int[] nums, int i, int val){
		for(int j = i; j < nums.length; j ++){
			if(nums[j] != val){
				return j;
			} 
		}
		return nums.length - 1;
	}

}
