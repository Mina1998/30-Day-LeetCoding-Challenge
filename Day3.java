import java.util.*;

public class Main {

	public static void main(String[] args) {	
		int []nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	
	// Third Day : Maximum Sub Array
	public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int[] sum =  new int[nums.length];
        sum[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
            result = Math.max(result, sum[i]);
        }
 
        return result;
    }

}
