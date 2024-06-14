import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class RemoveDuplicateElements
{
	public static void main(String[] args) {

		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < numbersList.size(); i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < numbers.size(); j++) {
				if (numbers.get(j) == numbersList.get(i)) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				numbers.add(numbersList.get(i));
			}
		}

		System.out.println(numbers);
		
	}
}