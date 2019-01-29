/*
 * 1被读作1 
2开始数上面1的数，即1个1 ，也就是11
3开始数上面2的数，即2个1，也就是21
4开始数上面3的数，即1个2，1个1，也就是1211
5开始数上面4的数，即1个1，1个2,2个1，也就是111221

 */
public class sayandCount {
	public static String countAndSay(int n) {
		int i = 1;
		String res = "1";
		while (i < n) {
			res = countOnce(res);
			i++;
		}
		return res;
	}

	public static String countOnce(String res) {
		char c = res.charAt(0);//取出字符串对应的值
		int num = 1;//记录字符出现的次数
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < res.length(); i++) {
			if (res.charAt(i) == c) {
				num++;
				continue;
			}
			sb.append(String.valueOf(num) + c);//字符串转换后进行连接
			c = res.charAt(i);//重新对c进行赋值进行统计下个字符
			num = 1;
		}
		sb.append(String.valueOf(num) + c);
		return sb.toString();//返回一个与sb相同的字符串
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(countAndSay(n));
	}
}
