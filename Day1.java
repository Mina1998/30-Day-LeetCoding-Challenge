import java.util.*;

public class Main {

	public static void main(String[] args) {
		int []nums = {4,1,2,1,2};
		int num = singleNumber(nums);
		System.out.println(num);
	}
	
	// First Day
	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0 ; i < nums.length ; i++) {
			if (i == nums.length -1)
				return nums[i];
			else if (nums[i] == nums[i+1])
				i++;
			else
				return nums[i];
		}
		return 0;
    }

}
