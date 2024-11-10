package github;
/*Remove all adjacent Duplicates in given string. Example:Input:"aabbaca",remove:"bb",output:"aaca"-->
 * "ca"*/

public class remove {
	public static String duplicates(String s) {
		StringBuilder sb = new StringBuilder();
		for(char ch:s.toCharArray()) {
			int len = sb.length();
			if(len > 0 && sb.charAt(len-1)==ch) {
				sb.deleteCharAt(len-1);
			}else {
				sb.append(ch);
			}
		}
		return sb.toString();	
	}
	public static void main(String[] args) {
		String input = "abbaca";
		String output = duplicates(input);
		System.out.println("result after removing adjacent duplicates:" + output);
	}
}
