package Chris.Chapter05.Loop;

import java.util.*;

public class Hw0520 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int input = x.nextInt();
		switch (input) {
		case 1:
		case 2:
		case 12:
			System.out.print("冬天");
			break;
		case 3:
		case 4:
		case 5:
			System.out.print("春天");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("夏天");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("秋天");
			break;		
		
		default :
			System.out.print("月份不存在");
		}	
	}

}
