public class t0102 {
	 public static int removeDuplicates(int [] num){
    	 if(num.length==0)  return 0;
    	 int pre = 0;
    	 int cur = 0;
    	 int n = num.length;
    	 while(cur<n){
    		 if(num[pre]==num[cur]) ++cur;
    		 else num[++pre] = num[cur++];
    	 }
    	 return pre+1;
     }
     public static void main(String [] args){
    	 int [] num = {0,0,1,1,2,2};
    	 System.out.print(removeDuplicates(num));
     }
}
