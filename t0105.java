public class t0105 {
	public static void bubble_sort(int [] nums){
		int len = nums.length,temp;
		for(int i = 0; i<len-1;i++){
			 for(int j= 0;j<len-1-i;j++){
				 if(nums[j]>nums[j+1]){
					  temp = nums[j];
					    nums[j] = nums[j+1];
					    nums[j+1] = temp;
				 }
		}
	  }  
	}
	public static int search(int [] nums, int target){
	    bubble_sort(nums);
	  int left = 0, right = nums.length-1;
	    while(left<=right){
		  int mid = (left+right)/2;
		  if(nums[mid]==target) return mid;
		  else if(nums[mid] < target)
			     left = mid + 1;
		  else
			    right = mid -1;
		 }
	 return -1;
	}
  public static void main(String [] args){
		int [] nums ={4,6,8,2,3,0,7};
		int target = 8;
		System.out.println(search(nums,target));
}
}
