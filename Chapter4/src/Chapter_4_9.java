class Sample {
	public int a;
	private int b;
	int c; // ����Ʈ ���� ����
	
	public int getB() {
		return b;
	}
	
	public void setB(int value) {
		b= value;
	}
}
public class Chapter_4_9 {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10;
		
		System.out.println(aClass.getB());
	}

}
