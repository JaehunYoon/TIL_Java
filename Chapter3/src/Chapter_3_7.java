import java.util.Scanner;

public class Chapter_3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max=0;
		
		for(int i=0;i<5;i++)
		{
			intArray[i]=in.nextInt();
			
			if(max<intArray[i])
				max=intArray[i];
		}
		System.out.print("�Էµ� ������ ���� ū ���� "+max+" �Դϴ�.");
	}

}
