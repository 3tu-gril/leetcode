public class t0103{
	public static int removeElement(int[] nums, int val) {
        int res=0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]!=val)  nums[res++] = nums[i];
}
        return res;
    }
	public static void main(String args[]){
		int [] nums ={3,2,2,3};
		int val = 3;
		System.out.print(removeElement(nums,val));
	}
}
