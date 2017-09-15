
public class Chapter_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			sum+=i;
			if(i==10)
			{
				System.out.print("=");
				System.out.print(sum);
			}
			else
				System.out.print("+");
		}
	}

}
