package level1;

public class LargestNumber {

	public static void main(String[] args) {

		int[] numbers = { -5, 2, 810, -9, 110, 0, 8};
		
		System.out.println(findLargest(numbers));

	}

	private static int findLargest(int[] numbers) {

		int largest = numbers[0];
		
		for(int x = 1; x < numbers.length; x++) {
			if(numbers[x] > largest) {
				largest = numbers[x];
			}
		}
		
		return largest;
	}

}
