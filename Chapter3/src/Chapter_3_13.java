import java.util.Scanner;

public class Chapter_3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("�������� �Է��Ͻÿ�.");
		dividend = rd.nextInt();
		System.out.print("�������� �Է��Ͻÿ�.");
		divisor = rd.nextInt();
		
		try {
			System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}
