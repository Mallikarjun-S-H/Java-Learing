package arrySortingMethods;

public class Sorting {

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//time complexity = O(n^2)
	//bubbleSort 6,2,4,8,3,9,1,5}
	public static void bubbleSort(int arr[]) {
		for(int i= 0;i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;		
				}
			}		
		}
		printArray(arr);
	}
	
	//time complexity = O(n^2)
	//SelectionSort 6,2,4,8,3,9,1,5}
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}
	
		//time complexity = O(n^2)
		//SelectionSort 6,2,4,8,3,9,1,5}
	public static void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j=i-1;
			while( j>=0 && current < arr[j]) {
				current = arr[j];
				arr[j+1] = arr[j];
				j--;
			}
			//placement
			
			arr[j+1] = current;
			
		}
		printArray(arr);
	}
	
	//MergeSort 6,2,4,8,3,9,1,5}
	//time complexity o(n log n)
	//https://www.youtube.com/watch?v=unxAnJBy12Q&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=22&pp=iAQB
	public static void divide(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid = (si+ei)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);	
		
		conquer(arr, si, mid, ei);
	}
	private static void conquer(int[] arr, int si, int mid, int ei) {
		int merged[] = new int[ei - si + 1];
		
		int idx1 =si;
		int idx2 = mid+1;
		int x =0;	
			
		while(idx1 <= mid && idx2 <= ei ) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++]= arr[idx1++];
			}else {
				merged[x++] = arr[idx2++];
			}
		}
		
		while(idx1 <= mid) {
			merged[x++] =arr[idx1++];
		}
		while(idx2 <= ei) {
			merged[x++] =arr[idx2++];
		}
		
		for(int i=0, j =si; i<merged.length; i++, j++ ) {
			arr[j] = merged[i];
		}
	}

	private static void mergesort(int[] arr, int si, int n) {
			divide(arr, 0, n-1);
			 for(int i =0; i< n; i++) {
				System.out.print(arr[i]+ " ");
			}
	}
	
	
	//time complexity = O(n^2)
	//QuickSort 6,2,4,8,3,9,1,5}
	//https://youtu.be/QXum8HQd_l4?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop
	
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		
		for(int j= low; j<high; j++) {
			
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		return i;
	}
	private static void quicksort(int[] arr, int low, int high) {
		
		if(low < high) {
			 int pidx= partition(arr, low, high);
			 quicksort(arr, low, pidx-1);
			 quicksort(arr, pidx+1, high);
		}
		
	}
	

	public static void main(String[] args) {

		int arr[] = {6,2,4,8,3,9,1,5};
		int n =arr.length;
		
//		bubbleSort(arr);
//		System.out.println();
//		selectionSort(arr);
//		System.out.println();
//		insertionSort(arr);
//		System.out.println();
//		mergesort(arr, 0, n);
//		System.out.println();
		quicksort(arr, 0, n-1);
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}	

}
