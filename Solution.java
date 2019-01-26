import java.util.Scanner;
	//判断回文字符串的方法
	//将字符串倒置后逐一比较
public class  Solution{
	public static void main(String[] args){
		String string = "";
		System.out.println("请输入一个字符串");
		Scanner input = new Scanner(System.in);
		string = input.next();
	    
		StringBuffer sb = new StringBuffer(string);
		sb.reverse();
		
		int count = 0;
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == sb.charAt(i)){
				count ++;
			}
		}
		if (count == string.length()){
			System.out.println("true");
		}else{
			System.out.println("false");
	}
}
}