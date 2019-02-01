/*
 * 先把每一位相乘，得到一个临时结果，然后把临时结果从低位起依次进位，对于一个n位数*m位数，最多只有（m+n）位，
 * 当首位为0时，应当去掉
 */
public class multiplystring {
	public static String multiply(String num1, String num2) {
	       int n1 = num1.length();
	       int n2 = num2.length();
	       StringBuilder sb = new StringBuilder();
	       int []tmp = new int[n1+n2];
	       for(int i=n1-1;i>=0;i--){
	    	   for(int j=n2-1;j>=0;j--){
	    		   tmp[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
	    		   System.out.println(tmp[i+j+1]);
	    	   }
	       }
	       int carrybit=0;//从个位开始，carrybit是进位
	       for(int i=tmp.length-1;i>=0;i--){
	    	   tmp[i]+=carrybit;
	    	   carrybit=tmp[i]/10;
	    	   tmp[i]=tmp[i]%10;
	       }
	       int left=0;
	       while(left<tmp.length-1&&tmp[left]==0)//去掉首位为0的情况
	    	   left++;
	       for(;left<tmp.length;left++){
	    	   sb.append(tmp[left]);
	       }
	       return sb.toString();
	}
	public static void main(String [] args){
		String num1="289";
		String num2="758";
		System.out.println(multiply(num1,num2));
	}
}
