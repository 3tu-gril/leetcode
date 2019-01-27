public class searchRangeSolution {
public static int [] searchRange(int [] nums, int target){
	int [] res = {-1,-1};
	if(nums==null || nums.length == 0){
		return res;
	}
	//寻找左边界
	int l1 = 0;
	int lr = nums.length - 1;
	while(l1<=lr){
		int mid = l1 +(lr-l1)/2;
		if(nums[mid]<target){
			l1 = mid + 1;
		}else{
			lr = mid -1;
		}
	}
	//寻找右边界
	int rl = 0;
	int rr = nums.length -1;
	while(rl<=rr){
		int mid = rl+(rr-rl)/2;
		if(nums[mid]<=target){
			  rl = mid + 1;
		}else{
			rr = mid - 1;
		}
	}
	//检查目标值是否找到
	if(l1> rr){
		return res;
	}
	 res[0] = l1;
	 res[1] = rr;
	 return res;
	}
}
