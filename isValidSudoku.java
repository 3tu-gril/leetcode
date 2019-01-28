import java.util.HashSet;
import java.util.Set;
/*
 * 满足行，列和3*3的网格区域中没有0-9的重复数字即可，
 * 因为HashSet不能包含重复数字，向HashSet添加数字时，
 * 如果该集合中无该数字，则该add()函数将返回true。
 * 如果当已存在相同的数字时，
 * 该add()函数将返回false
 * 需要注意3*3网格的下标位置的计算
 */
public class isValidSudoku {
public boolean isValidSudokuu(char[][] board) {
        //每一个大循环确定一行，一列，一个九宫格
	for (int i = 0; i < 9;i++){
		Set<Character> row = new HashSet<Character>();
		Set<Character> col = new HashSet<Character>();
		Set<Character> grid = new HashSet<Character>();
		for(int j=0; j<9;j++){
			//第i行
			if(board[i][j]!='.'&& ! row.add(board[i][j]))
				return false;
			//第i列
			if(board[j][i]!='.'&& ! col.add(board[j][i]))
				return false;
		int gridRow = 3 * (i / 3)+j / 3;
		int gridCol = 3 * (i % 3)+j;
		if(board[gridRow][gridCol]!='.' && grid.add(board[gridRow][gridCol]))
			return false;
			}
      }
	return true;
    }
public static void main(String [] args){
	char [9][9] board={{"5","3",".",".","7",".",".",".","."},
			{"6",".",".","1","9","5",".",".","."},
			{".","9","8",".",".",".",".","6","."},
			{"8",".",".",".","6",".",".",".","3"},
			{"4",".",".","8",".","3",".",".","1"},
			{"7",".",".",".","2",".",".",".","6"},
			{".","6",".",".",".",".","2","8","."},
			{".",".",".","4","1","9",".",".","5"},
			{".",".",".",".","8",".",".","7","9"}};
	System.out.println(isValidSudokuu(board));
}
}
