

public class Solution{

	public void recoverRotatedSortedArray(ArrayList<Integer> nums ){
		if(nums == null || nums.size() <= 1){
			return;
		}

		int pos = 1;

		while(pos < nums.size()){
			if(nums.get(pos - 1) > nums.get(pos)){
				break;
			}
			pos++;
		}

		myRotate(nums, 0 , pos - 1);
		myRotate(nums, pos, nums.size() - 1);
		myRotate(nums, 0 , nums.size() - 1);
	}

	private void myRotate(ArrayList<Integer> nums, int left , int right){
		while(left < right){
			int temp = nums.get(left);
			nums.set(left, nums.get(right));
			nums.set(right, temp);
			left++;
			right++;
		}
	}
}