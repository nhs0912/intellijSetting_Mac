class SelectSort {
	int[] numbers;

	SelectSort() {
		// Default Constructor
	}

	SelectSort(int[] numbers) {// Get an array
		this.numbers = numbers;
	}

	int findMinNum(int num) {
		// 제일 작은 수 구하기
		int i = num;
		for (; i < numbers.length; i++) {

		}
		return 0;
	}

	void swap() {// 숫자바꾸기

	}

	void execute() {

	}

	void display() {// show an array
		for (int i = 0; i < numbers.length; i++) {
			if (i == numbers.length - 1) {
				System.out.print(numbers[i]);
			} else {
				System.out.print(numbers[i] + " ,");
			}
		}
	}
}

public class Sort {
	public static void main(String[] args) {
		int[] numbers = new int[] { 5, 2, 4, 1, 3 };
		SelectSort selection = new SelectSort(numbers);
		selection.execute();
		selection.display();

	}
}
