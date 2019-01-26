public class t0110 {
public static int searchInsert(int [] nums, int target){
	if(target<nums[0]) return 0;
	int left, right,mid;
	 left=0;
	 right=nums.length-1;
	 mid=(left + right)/2;
	 right = mid;
	 mid = (left+right)/2;
    while(left <=right){
    	if(nums[mid]==target) return mid;
    	else if(nums[mid]<target)
    		 left = mid + 1;
    	else 
    		right = mid - 1;
    	}
    left = mid;
    mid=(left + right)/2;
    while(left <=right){
    	if(nums[mid]==target) return mid;
    	else if(nums[mid]<target)
    		 left = mid + 1;
    	else 
    		right = mid - 1;
    	}
   return nums.length-1;
}
    
     
public static void main(String [] args){
	int [] nums = {1,2,3,4,5,6};
	int target = 6;
	System.out.println(searchInsert(nums,target));
}
}
