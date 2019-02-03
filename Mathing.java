/*
 * ?表示匹配当前任意一个字符
 * *表示匹配当前若干个字符，当s中间某个位置对应*号时，这个*号是对应0个或多个字符的
 * 但是主要问题是，具体s中的符号要往前多少个才算是一个合理的匹配。
 */
public class Mathing {
    public static boolean isMatch(String str,String pattern){
    	int s = 0,p = 0,match = 0, starIndex = -1;
    	while(s< str.length()){
    		//当两个字符对应位置完全相等或者pattern中有?时
    		if(p<pattern.length() && (pattern.charAt(p)=='?'||str.charAt(s)==pattern.charAt(p))){
    			s++;
    			p++;
    		}
    		else if(p<pattern.length()&&pattern.charAt(p) == '*'){
    			starIndex = p; //starIndex表示*所在的位置
    			match = s;    // match记录*匹配到的s字符串的位置，和不用*匹配到的字符串位置相区分
    			p++;     
    		}
    		//如果字符不同也没有？，p指向的也不是*,但是之前已经遇到了*，则从match继续匹配任意字符
    		else if(starIndex != -1){
    			p = starIndex + 1;//用遇到的*来匹配，指针p应该退回至上一个*后面
    			match++;//用*匹配到的位置递增
    			s = match;
    		}
    		else return false;
    	}
    	//s已经匹配完了，但是因为一个*能匹配无限序列，如果末尾有多个*，都要跳过
    	while(p<pattern.length() && pattern.charAt(p)=='*')
    		p++;
    	//如果匹配完了说明成功
    	return p == pattern.length();
    }
    public static void main(String [] args){
    	String s =  "acdcb";
    	String p = "a*c?b";
    	System.out.println(isMatch(s,p));
    }
}
