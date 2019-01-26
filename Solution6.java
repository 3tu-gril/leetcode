public class Solution6 {
 public static int reverse(int x){
	  int res = 0;
	  while(x != 0){
		  int tail = x%10;
		  int newRes = res*10 + tail;
		  if((newRes-tail)/10!=res)//如果newRes-tail/10!=res 则溢出
			  return 0;
		      res=newRes;
		      x=x/10;
		 }
	  return res;
  }
 public static void main(String [] args){
	 int x = 1534236469;
	 System.out.println(reverse(x));
 }
}
