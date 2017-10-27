
public class Chapter_4_1 {
	int base;
	int exp;
	int getValue() {
		int res=1;
		for(int i=0;i<exp;i++)
			res = res * base;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter_4_1 number1 = new Chapter_4_1();
		number1.base=2;
		number1.exp=3;
		Chapter_4_1 number2 = new Chapter_4_1();
		number2.base=3;
		number2.exp=4;
		
		System.out.println("2ÀÇ 3½Â = "+number1.getValue());
		System.out.println("3ÀÇ 4½Â = "+number2.getValue());
	}

}
