public class t0108 {
     public static void nextPermutation(int [] nums){
    	 if(nums.length <=1){
    		 return ;
    	 }
    	 int i = nums.length -2 ;
    	//找到第一个下降点，要把这个下降点的值增加一点点
    	 //对于511这种情况，要把前面两个1都跳过，所以要包含等于
    	 while(i >= 0 && nums[i] >=nums[i+1]){
    		 i--;
    	 }
    	 //如果这个下降点还在数组内，则要找到比它大一点的数替换
    	 //如果在之外，说明整个数组是降序的，是全局最大了
    	 if(i >=0){
    		 int j = nums.length - 1;
    		 //对于151这种情况，要把最后那个1跳过， 所以包含等于
    		 while(j > i && nums[j] <= nums[i]){
    			 j--;
    		 }
    		 swap(nums,i,j);
    	 }
    	 //将下降点之前的部分倒序构成一个最小序列
    	 reverse(nums,i+1,nums.length-1);
     }
     private static void swap(int [] nums, int i  ,int j){
    	 int tmp = nums[i];
    	    nums[i] = nums[j];
    	    nums[j] = tmp;
     }
     private static void reverse(int [] nums,int left, int right){
    	 while(left < right){
    		 swap(nums,left,right);
    		 left++;
    		 right--;
    	 }
     }
     public static void  press(int [] nums){
    	 nextPermutation(nums);
    	 for(int i=0;i<nums.length;i++)
    		 System.out.print(nums[i]);
     }
     public static void main(String [] args){
    	 int [] nums ={1,2,4,6,5,1};
    	 press(nums);
     }
}
