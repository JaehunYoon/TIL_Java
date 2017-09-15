import java.util.Scanner;

public class Chapter_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		
		int score=scan.nextInt();
		
		if(score>=80)
			System.out.println("참 잘했어요!");
		else
			System.out.println("집에 가셈");
	}

}
