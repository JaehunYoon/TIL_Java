import java.util.Scanner;

public class Chapter_2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			int score = in.nextInt();
			if(score<=100 && score>=0)
			{
				if(score<=100 && score>=90)
					System.out.println("A");
				else if(score<=90 && score>=80)
					System.out.println("B");
				else if(score<=80 && score>=60)
					System.out.println("C");
				else
					System.out.println("F");
			}
			else
				System.out.println("0 이상 100 이하의 값만 입력하세요.");
		}
	}

}
