public class t0107 {
	public static int divide(int dividend, int divisor) {
		int sum = 0;
		int count = 0;
		int rem=0;//记录输入时同号0还是异号1
		if(dividend !=1 && divisor == -1)
			return Integer.MAX_VALUE;
		if(dividend > 0 && divisor >0){
			dividend = dividend;
			divisor = divisor;
			rem = 0;//
		}
		if(dividend < 0 && divisor < 0){
			dividend = -dividend;
			divisor = -divisor;
			rem=0;
		}
		if(dividend > 0 && divisor < 0){
			dividend = dividend;
			divisor = -divisor;
			rem=1;
		}
		if(dividend < 0 && divisor >0){
			dividend = -dividend;
			divisor = divisor;
			rem=1;
		}
		while(sum<=dividend){
			sum = sum +divisor;
			count++;
		}
		count--;
		if(rem == 0)
		  return count;
		else
		   return -count;
		
		
}

 public static void main(String [] args){
	   int dividend = 1;
	   int divisor = -1;
	   System.out.println(divide(dividend,divisor));
	   
   }
}
