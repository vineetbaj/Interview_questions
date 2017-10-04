import java.util.HashMap;
import java.util.Map;

public class Finding_duplicates_values_in_array {

	public static void main(String[] args) {
		int[] arr = {0,2,4,3,3,2,3,1,1,4,2,5,6,3,2};
		duplicatearrayvalue(arr);

	}

	public static void duplicatearrayvalue(int[] arr) {
		int len = arr.length;
		Map<Integer, Integer> map = new HashMap<Integer,Integer>(); 
		System.out.println("Duplicate values are : ");
		for(int i=0;i<len;i++){
			if(map.containsKey(arr[i])){
				int val = (int)(map.get(arr[i]));
				val++;
				map.put(arr[i], val);
				System.out.print(arr[i]+" ");
			}
			else
				map.put(arr[i], 0);
		}
	}
}
