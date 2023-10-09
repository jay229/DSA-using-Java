class Solution {
    public  int firstOccur(int[] arr, int n, int k){
		int start=0;
		int end=n-1;
		int index=-1;
		//int mid=start+(end-start)/2;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]==k){
				index=mid;
				end=mid-1;
			}
			else if(k<arr[mid])
				end=mid-1;
			else
				start=mid+1;	
		}
		return index;
	}
	public  int lastOccur(int[] arr, int n, int k){
		int start=0;
		int end=n-1;
		int index=-1;
		//int mid=start+(end-start)/2;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(arr[mid]==k){
				index=mid;
				start=mid+1;
			}
			else if(arr[mid]>k)
				end=mid-1;
				
			else
				start=mid+1;
		}
		return index;
	}
    public int[] searchRange(int[] arr, int k) {
        int n=arr.length;
        int leftMost=firstOccur(arr,n,k);
	    int rightMost=lastOccur(arr,n,k);
        int res[]={leftMost,rightMost};
        return res;
    }
}