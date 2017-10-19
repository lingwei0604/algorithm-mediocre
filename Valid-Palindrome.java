
public class Solution{

	public boolean isPalindrome(String s){

		if(s == null || s.isEmpty()) return true;


		int l = 0, r = s.length() - 1;

		while(l < r){
			//find left alphanumeric character
			if(!Character.isLetterOrDigit(s.charAt(l))){
				l++;
				continue;
			}
			//find right alphanimeric character
			if(!Character.isLetterOrDigit(s.charAt(r))){
				r--;
				continue;
			}

			//case insersitive compare

			if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
				l++;
				r--;
			}else{
				return false;
			}
		}
	}
}