import java.util.*;

class RemoveDuplicate {

	public static void main(String arg[]) {
		int size = 10;

		int ar[] = {5,  4,  5,  2,  3,  1,  6,  7,  5,  1, };
		
		System.out.println("array elemet");
		for (int i : ar) {
			System.out.print(i + "  ");
		}

		// size = withoutCollection(ar,size);
		usingCollection(ar);
		
		// System.out.println("\nremove duplicate array elemet");
		// for (int i = 0; i < size; i++) {
			// System.out.print(ar[i] + "  ");
		// }
	}
	public static int withoutCollection(int ar[],int size) {
	
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (ar[i] == ar[j]) {
					for (int k = j; k < size - 1; k++) {
						ar[k] = ar[k + 1];
					}
					size--;
					j--;
				}
			}
		}
		return size;
	}
	
	public static void usingCollection(int ar[]) {
	
		Set<Integer> set = new HashSet<>();
	   
		for(int i : ar) set.add(i);
		
		int arr[] = new int[set.size()];
		
		int i = 0;
		
		for(Integer j : set) arr[i++] = j;
		
		System.out.print("\n"+Arrays.toString(set));
		
	}

}
