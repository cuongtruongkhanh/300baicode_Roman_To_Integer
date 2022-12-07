public class Roman_To_Integer {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	static int romanToInt(String s) {
		int[] nums = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				nums[i] = 1;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'L':
				nums[i] = 50;
				break;
			case 'C':
				nums[i] = 100;
				break;
			case 'D':
				nums[i] = 500;
				break;
			case 'M':
				nums[i] = 1000;
				break;
			default:
				break;
			}
		}
		int number = 0;
		for (int i = 0; i < s.length() - 1; i++) {

			if (nums[i] >= nums[i + 1]) {
				number += nums[i];
			}
			if (nums[i] < nums[i + 1]) {
				number -= nums[i];
			}
		}
		return number + nums[nums.length - 1];
	}
}
