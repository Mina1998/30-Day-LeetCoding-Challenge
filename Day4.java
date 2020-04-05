/*
 * LeetCode 30 days
 * */

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	}

	// Fourth Day : Move Zeros
	public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
            { 
                nums[count++] = nums[i]; 
            }
        }
 
        while (count < nums.length) 
        {
            nums[count++] = 0; 
        }
	}

}
