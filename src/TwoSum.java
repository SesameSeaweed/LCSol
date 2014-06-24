import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = numbers.length;
		int[] result = new int[2];
		for (int i = 0; i < count; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[0] = map.get(target - numbers[i]) + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(numbers[i], i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = new int[2];
		int[] numbers = { 2, 7, 11, 15 };
		result = twoSum(numbers, 9);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
