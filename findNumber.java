package be6_hw11;

public class findNumber {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println(findNumberReturnIndex(num, 100));

	}

	public static int findNumberReturnIndex(int[] array, int num) {
		int firstIndex = 0;
		int lastIndex = array.length - 1;
		int midIndex = (lastIndex - firstIndex) / 2;

		int step = 1;

		if (num == array[midIndex]) {
			System.out.println("Step : " + step);
			step++;
			return midIndex;
		} else if (num <= array[midIndex]) {
			for (int i = 0; i < array[midIndex]; i++) {
				if (num == array[i]) {
					System.out.println("Step : " + step);
					step++;
					return i;
				}
			}
		} else {
			for (int j = midIndex + 1; j < array.length; j++) {
				if (num == array[j]) {
					System.out.println("Step : " + step);
					step++;
					return j;
				}
			}
		}
		return -1;

	}

}
