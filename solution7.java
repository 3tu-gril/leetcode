import java.util.Arrays;

public class solution7 {
public static int threeSumClosest(int[] nums, int target) {
        //sort the nums array
	Arrays.sort(nums);
	int closesetSum = 0;
	int diff = Integer.MAX_VALUE;
	//interate nums array ,no need for the last two numbers because we need at lesat three numbers
	for(int i = 0; i<nums.length-2;i++){
		int left = i + 1;
		int right = nums.length - 1;
		// use two pointer to interate rest array
		while(left<right){
		int temp_sum = nums[i] + nums[left] + nums[right];
		int temp_diff = Math.abs(temp_sum-target);
		//if find a new closer sum, then update sum and diff
		if(temp_diff < diff){
			closesetSum = temp_sum;
			diff = temp_diff;
		}
		if(temp_sum < target ){
			left ++;
			}
		else if(temp_sum> target){
			right --;
		}else{
			return temp_sum;
		}
		}
	}
	return closesetSum;
    }
public static void main(String [] agrs){
	int [] nums = {-1,2,1,-4};
	int target = 1;
	System.out.println(threeSumClosest(nums, target));
}
}
