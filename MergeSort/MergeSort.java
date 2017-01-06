public class MergeSort {

	public void mergeSort(int[] array) {

		int[] helper = new int[array.length];
		mergeSort(array, helper, array[0], array.length-1);
	}

	public void mergeSort(int[] array, int[] helper, int low, int high) {

		if (low = high) {

			return ;
		}

		int mid = (low+high)/2;
		mergeSort(array, helper, low, mid);
		mergeSort(array, helper, mid +1, high);
		merge(array, helper, low, mid , high);
	}

	public void merge(int[] array, int[] helper, int low, int mid, int high) {

		// copy all the values of the array into the helper array 
		for (int i =0; i<array.length;i++) {

			helper[i]= array[i];
		}

		int helperLeft = low;
		int helperRight = mid+1;
		int current = low;

		// iterate through the helper array , compare the left and right array and copy the smaller element back to the original array

		while (helperLeft <= mid && helperRight <= high) {

			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			}
			else {
				array[current] = helper[helperRight];
				helperRight++;
			}

			current++;
		}

		//copy the rest of the left side of the array into the target array 

		int remaining = mid - helperLeft;
		for (int i=0; i<=remaining;i++) {

			array[current+i]= helper[helperLeft+i];
		}
		

	}
}