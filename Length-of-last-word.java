
public class Solution{

	public int lengthOfLastWord(String s){
		if(s == null | s.isEmpty()) return 0;


		//trim right space 
		int begin = 0, end = s.length();

		while(end > 0; && s.charAt(end - 1) == ' '){
			end--;
		}

		//find the last space

		for(int i = 0; i < end; i++){
			if(s.charAt(i) == ' '){
				begin = i + 1;
			}
		}

		return end - begin;
	} 
}