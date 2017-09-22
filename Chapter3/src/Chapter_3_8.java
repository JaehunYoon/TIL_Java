import java.util.Scanner;

public class Chapter_3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int average=0;
		
		int intArray[] = new int[5];
		
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i]=in.nextInt();
			average+=intArray[i];
		}
		in.close();
		System.out.print("입력받은 값의 평균은 "+ average/intArray.length + "입니다.");
	}

}
