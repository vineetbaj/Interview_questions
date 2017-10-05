
public class Permutation_n_comb_of_string {

		public static void main(String args[]) {
		    string_permutation("", "Love");
		  }

		  public static void string_permutation(String beginningString, String endingString) {
		    if (endingString.length() <= 1)
		      System.out.println(beginningString + endingString + " ");
		    else
		      for (int i = 0; i < endingString.length(); i++) {
		        try {
		          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
		          string_permutation(beginningString + endingString.charAt(i), newString);
		        } catch (StringIndexOutOfBoundsException exception) {
		          exception.printStackTrace();
		        }
		      }
		  }
}
