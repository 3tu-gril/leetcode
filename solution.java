public class solution {
public boolean isPalindrome(int x){
	if(x<0)
		return false;
	 int div = 1;
	 while(x/div >= 10) 
		 div = div * 10;
	 while(x > 0){
		 int left = x / div;
		 int right = x % 10;
		 div = div / 100;
	 }
	 return true;
}
}
