
public class Chapter_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
				continue;
			sum+=i;
			
			if(i==100)
				System.out.println("1 ~ 100까지의 짝수의 합 = "+sum);
		}
	}

}
