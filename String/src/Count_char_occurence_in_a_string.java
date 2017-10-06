import java.util.HashMap;
import java.util.Map;

public class Count_char_occurence_in_a_string {

	public static void main(String[] args) {
		String str = new String("MISSISSIPPI");
		cal_occurence(str);
	}

	public static void cal_occurence(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);	
		}
		
		//keys with their occurrence
		System.out.println(map.keySet() +" = "+ map.values());
	}

}
