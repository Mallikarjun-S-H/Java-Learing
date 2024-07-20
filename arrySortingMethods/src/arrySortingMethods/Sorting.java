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
	
	
	public static void main(String[] args) {

		int arr[] = {6,2,4,8,3,9,1,5};
		
		bubbleSort(arr);
		System.out.println();
		selectionSort(arr);
		System.out.println();
		insertionSort(arr);
	}

}
