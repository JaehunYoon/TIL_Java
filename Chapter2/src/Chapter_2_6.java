import java.util.Scanner;

public class Chapter_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� : ");
		
		int score=scan.nextInt();
		
		if(score>=80)
			System.out.println("�� ���߾��!");
		else
			System.out.println("���� ����");
	}

}
