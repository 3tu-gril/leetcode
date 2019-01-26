public class Solution5 {
public static String convert(String s, int nRows){
	if(nRows<=1)
		return s;
	StringBuilder res = new StringBuilder();
    res.append("");
	int size = 2*nRows - 2;
	for(int i = 0; i<nRows; ++i){
		 for(int j = i; j<s.length();j+=size){
			 res.append(s.charAt(j));
			 if(i!= 0 && i != nRows-1 ){
				 int tmp = j+size-2*i;
				 if(tmp < s.length())
				 res.append(s.charAt(tmp));
		 }
	}
	}
	return res.toString();
}
public static void main(String args[]){
	String s ="PAYPALISHIRING";
	int nRows = 2;
	System.out.println(convert(s,nRows));
	
}
}
