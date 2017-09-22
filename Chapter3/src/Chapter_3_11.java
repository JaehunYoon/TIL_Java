
public class Chapter_3_11 {
	static int[] makeArray() {
		int temp[] = new int[5];
		
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {};
		
		intArray = makeArray();
		
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
	}

}
