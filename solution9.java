import java.util.Scanner;

public class solution9 {
public  static  boolean  main(String [] args){
	System.out.println("请输入一个数");
	Scanner input = new Scanner(System.in);
	     int x = input.nextInt();
        int y = 0;
        int x1 = x;
	   if(x < 0)
		  return false;
	   while(x!=0){
		  x = x% 10;
		  y = y*10+ x;
		  x = x/10;
		  }
	   if(x1 == y)
		   return true;
	   return false;
}
}
