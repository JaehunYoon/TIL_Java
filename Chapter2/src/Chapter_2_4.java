
public class Chapter_2_4 {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		// ��Ʈ����
		System.out.printf("%x\n", a & b); // AND ����
		System.out.printf("%x\n", a | b); // OR ����
		System.out.printf("%x\n", a ^ b); // XOR ����
		System.out.printf("%x\n", ~a);    // NOT ����

		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		// ����Ʈ ����
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", d >>> 2);
	}

}
