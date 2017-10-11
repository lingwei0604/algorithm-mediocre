

Java

class solution{

	public int strStr(String source, String target){
		if(source == null || target == null){
			return -1;
		}
		int i, j;

		for (i = 0; i < source.length() - target.length() + 1; i++){
			for (j = 0; i < target.length(); j++){
				if(source.charAt(i + j) != target.charAt(j)){
					break;
				}
			}
			if(j == target.length()){
				return i;
			}
		}

		return -1;
	}
}