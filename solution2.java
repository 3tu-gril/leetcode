public class solution2 {
public static String longestPalindrome(String s){
	int len = s.length();
	if(len <= 1)
		return s;
	String str = preProcess(s);
	int n = str.length(),id = 0, mx = 0;
	int [] p = new int[n];
	for(int i = 1; i < n-1; i++){
		p[i] = mx > i? Math.min(p[2*id-1], mx-i):1;
		while(str.charAt(i+p[i])==str.charAt(i-p[i]))
			p[i]++;
		if(i+p[i] > mx){
			mx = i+ p[i];
			id = i;
		}
	}
	int maxLen = 0, index = 0;
	for(int i = 1; i< n-1;i++)
		if(p[i] > maxLen){
			maxLen = p[i];
			index = i;
		}
	return s.substring((index - maxLen)/2,maxLen-1);
	
}
public static String preProcess(String s){
	int n = s.length();
	StringBuilder   res = new StringBuilder();
	res.insert(0,'$');//把$放到头部
	//res.insert('#');//以#作为原来字符串中每个字符的间隔
	for(int i =0; i < n; i++){
		res.append(s.charAt(i));
		res.append('#');
	}
	res.append('*');
	return res.toString();
}
public static void main(String [] args){
	String s = "abacd";
	System.out.println(longestPalindrome(s));
}
}
