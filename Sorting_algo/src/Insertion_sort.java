
public class Insertion_sort {

	public static void main(String[] args) {
		
		int arr[] = {2,3,1,5,4,7,9,8,0};
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]<arr[i-1]){
				
				for(int j=i;j>0;j--){
				 
					if(arr[j-1]>arr[j]){
					//Swapping without using the third variable	
					 arr[j]=arr[j-1]+arr[j];
					 arr[j-1]=arr[j]-arr[j-1];
					 arr[j]=arr[j]-arr[j-1];
				 
					}
				}
			}
		}
		
		//Displaying the sorted values
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
