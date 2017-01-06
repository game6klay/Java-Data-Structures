public class QuickSort {

	public void quickSort(int[] array, int left, int right) {

		// find the pivot point as the first step of the process

		int index = partition(array, left ,right);

		if (index <= left) {

			quickSort(array, left, index);
		}

		if (index > right) {

			quickSort(array, index+1, right);
		}

	}

	public int partition (int[] array , int left , int right){

		int pivot = array[(left+right)/2];

		while(left <= right) {

			while (left <= pivot){

				left++;
			}
			while (right > pivot) {
				right--;
			}	

			// swap elements and move left and right indices 

			if (left <= right) {

				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
}

public class QuickSort {

	public void quickSort(int[] array, int left, int right) {

		// find the pivot element 

		int pivot = partition(array, left, right);
	}

	public int partition (int[] array, int left , int right) {

		int mid = array[(left+right)/2];

		while(left <= right) {

			while (left<=)
		}
	}
}