import java.util.HashMap;
import java.util.Map;

public class String_anagram_check {

	public static void main(String[] args) {
		String str1 = new String("vineet");
		String str2 = new String("tineev");
		System.out.println(check_anagram(str1,str2));
	}

	public static boolean check_anagram(String str1, String str2) {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str1.length();i++){
			char c = str1.charAt(i);
			
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);	
		}
		
		for(int i=str2.length()-1;i>=0;i--){
			
			char c = str2.charAt(i);
			
			if(map.get(c)==null)
				return false;
			
			else if(map.get(c)==1)
				map.remove(c);	
			
			else
				map.put(c, map.get(c)-1);
			
		}
		
		return map.isEmpty();
	}
}
