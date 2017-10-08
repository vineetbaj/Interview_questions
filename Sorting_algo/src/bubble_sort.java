public class bubble_sort {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,5,4,7,9,8,0};
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){

				// Swapping without using third variable
				if(arr[j-1]>arr[j]){
				arr[j]=arr[j]+arr[j-1];
				arr[j-1]=arr[j]-arr[j-1];
				arr[j]=arr[j]-arr[j-1];
				}
				
			}
			
		}
		//Displaying the sorted values
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	
	}
}
