package github;
/*
 * define two strings as value and search value,return the index of the first character from the 
 * search value string in the values string.
 * example:("santosh","harshal")-2nd string starts with 'h',search it in the 1st string
 */
public class searchstr {
	public static int findIndexOfFirstCharacter(String value, String search) { 
		for(char ch:search.toCharArray()) {
			int index= value.indexOf(ch);
			if(index!=-1) {
				return index;
			}
		}
	return -1;
	}
	public static void main(String[] args) { 
			String value="vaishnavi";
			String search="Pranavi";
			int index=findIndexOfFirstCharacter(value,search);
			System.out.println("index of first character from 'search' in 'value':"+index);
	}
}
