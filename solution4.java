public class solution4 {
public static  String intToRoman(int num) {
	    String [] v1 = {"","M","MM","MMM"};
        String [] v2 = {"","C","CC","CCC","CCCC","D","DC","DCC","DCCC","CM"};
        String [] v3 = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] v4 = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return v1[num/1000] + v2[(num%1000)/100] + v3[(num%100)/10] + v4[num%10];
    }
public static void main(String [] args){
	System.out.println(intToRoman(1994));
}
}
