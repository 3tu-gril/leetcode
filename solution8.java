public class solution8 {
public static int myAtoi(String str){
	if(str == null || str.length() < 1){
		return 0;
	}
	str = str.trim();//删除空格
	char flag = '+';
	int i=0;           //字符的index
	if(str.charAt(0) == '-'){
		flag = '-';
		i=i+1;
	}else if(str.charAt(0)=='+'){
		i=i+1;
	}
	int res = 0;
	while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
	if(Integer.MAX_VALUE/10 < res || (Integer.MAX_VALUE/10 == res && Integer.MAX_VALUE%10 < (str.charAt(i)-'0')))
		return flag == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
	     res = res * 10 +(str.charAt(i)-'0');
	     i++;
	}
	if(flag == '-')
		res = -res;
	
       return   res;
}
public static void main(String [] args){
	String str = "42";
	System.out.println(myAtoi(str));
}
}
