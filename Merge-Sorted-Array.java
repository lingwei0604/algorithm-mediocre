class Solution{


	public void mergeSortedArray(int[] A, int m,int[] B,int n){
		if(A == null || B == null) return;

		int index = m + n -1;

		while(m>0 && n > 0){
			if(A[m - 1] > B[n - 1]){
				A[index] = A[m - 1];
				m--;
			}else{
				A[index] = B[n - 1];
				n--;
			}
			index--
		}
		while( n > 0){
			A[index] = B[n - 1];
			n--;
			index--;
		}
	}
}