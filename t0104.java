public class t0104 {
public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for(int i = 0 ;i<=m-n;i++){
        	int j;
        	for(j=0;j<n;j++){
        		if(haystack.charAt(i+j) != needle.charAt(j))
        			break;
        	}
        	if(j==n)
        		return i;
        }
        return -1;
    }
public static void main(String [] args){
	String haystack = "hello";
	String needle = "ll";
	System.out.print(strStr(haystack,needle));
}
}
