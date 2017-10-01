import java.util.Scanner;

public class Reverse_Of_String_Using_Recursion {

	public static void main(String[] args) {
		String input_Str,rev_Str;
		Scanner sc = new Scanner(System.in);
		input_Str = sc.nextLine();
		System.out.println(reverse(input_Str));
	}

	public static String reverse(String str) {
		if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);		
	}	
}
