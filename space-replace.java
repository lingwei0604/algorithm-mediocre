
public class Solution{

	public int replaceBlank(char[] string, int length){
		if(string == null) return 0;

		int space = 0;

		for(char c : string){
			if(c == ' ') space++;
		}

		int r = length + 2 * space - 1;
		for(int i = length - 1; i >=0; i--){
			if(string[i] != ' '){
				string[r] = string[i];
				r--;
			}else{
				string[r--] = '0';
				string[r--] = '2';
				string[r--] = '%';
			}
		}

		return length + 2 * space;
	}
}