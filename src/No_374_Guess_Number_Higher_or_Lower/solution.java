package No_374_Guess_Number_Higher_or_Lower;

public class solution {
	public static void main(String[] args) {
		System.out.println(guessNumber(10));
	}
	
	public static int guessNumber (int n) {
		int low = 1;
		int high = n;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int check = guess(mid);
			if (check == -1) {
				//mid is greater than the target
				high = mid - 1;
			} else if (check == 1) {
				//mid is less than the target
				low = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
		
	}
	
	
	
	public static int guess (int num) {
		if (num < 6) {
			return 1;
		} else if (num > 6) {
			return -1;
		} else {
			return 0;
		}
	}

}
