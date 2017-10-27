
public class Chapter_4_2 {
	int age=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter_4_2[] pa;
		pa = new Chapter_4_2[10];
		for(int i=0;i<pa.length;i++) {
			pa[i] = new Chapter_4_2();
			pa[i].age = 30 + i;
		}
		
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].age+" ");
		}
	}

}
