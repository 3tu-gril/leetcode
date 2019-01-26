
public class solution3 {
public static int maxArea(int[] height) {
         int max0 = 0,i =0;
         int j = height.length-1;
         while(i<j){
        	
        	 max0 = Math.max(max0,(( Math.min(height[i], height[j]))*(j-i)));
        	 if(height[i]<height[j]){
        		 i++;
        	 }else{
        		 j--;
        	 }
         }
         return max0;
        }
public static void main(String [] args){
	int [] height = {1,8,6,2,5,4,8,3,7};
	System.out.println(maxArea(height));
}
 }
