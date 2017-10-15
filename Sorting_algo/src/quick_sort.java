public class quick_sort {
	
	public static void main(String args[]){
		//Array to be sorted
		int arr[] = {2,3,1,5,4,7,9,8,0};
		
		//calling function of quicksort passing the array,initial index,and final index
		quicksort(arr,0,arr.length-1);
		
		//displaying the sorted array
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

	public static void quicksort(int[] arr, int low, int high) {
		
		if(low<high){
			//finding the pivot element
			int pivot = partition(arr,low,high);
			
			//calling again the divided arrays to be sorted
			quicksort(arr,low,pivot-1);
			quicksort(arr,pivot+1,high);
		}
		
	}

	public static int partition(int[] arr, int low, int high) {
		
		/*
		2 variables are used which are i & j
		j is incremented everytime while i increments at certain conditions
		*/
		
		//initializing i with low-1 values
		int i=low-1;
		
		//assuming pivot element to be the last element
		int pivot = arr[high];
		
		//
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				//swap arr[i] & arr[j]
				int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
			}
		}
		//swap pivot element with i+1
		int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;	
		
        //returning pivot element position
		return i+1;
	}

}
