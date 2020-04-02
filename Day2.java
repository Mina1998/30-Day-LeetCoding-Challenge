import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Testing
		System.out.println(isHappy(19));
	}
	
	// Second Day : Happy Number
	public static boolean isHappy(int num) {
		int sum;
		for (int i = 0 ; i < 10 ; i++) {
			sum = 0;
			while (num != 0) {
				int tmp = num % 10;
				num = num / 10;
				sum += Math.pow(tmp, 2);
			}
			if (sum == 1)
				return true;
			num = sum;
		}
        return false;
    }

}
