import java.util.ArrayList;
import java.util.List;
//全排列
public class solution8 {
	public static  List<String> letterCombinations(String digits) {
        String [] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List <String> result = new ArrayList<> ();
        if(digits.length() == 0){
        	return result;
        }
        formCombination(result,"",letters, 0, digits);
        return result;
    }
	 static void formCombination(List<String> result, String current, String [] letters, int index, String digits){
		if(index >= digits.length() && current.length() == digits.length()){
			result.add(current);
			return;
		}
		int digit = Integer.parseInt(digits.substring(index,index+1));
		char [] arr = letters[digit].toCharArray();
		for(int j=0;j<arr.length;j++){
			formCombination(result,current + arr[j],letters, index + 1,digits);
		}
	}
	 public static void main(String[] args){
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}
}
