
public class Chapter_2_1 {
	
	public static void main(String[] args) {
		final double PI = 3.14; // 원주율을 상수로 선언
		double radius = 10; // 원의 반지름
		double circleArea = 0; // 원의 면적
		
		circleArea = radius*radius*PI;
		
		System.out.print("원의 면적 = ");
		System.out.println(circleArea);
	}

}
