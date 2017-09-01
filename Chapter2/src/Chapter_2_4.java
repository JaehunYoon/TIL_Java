
public class Chapter_2_4 {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = 0x00ff;
		// 비트연산
		System.out.printf("%x\n", a & b); // AND 연산
		System.out.printf("%x\n", a | b); // OR 연산
		System.out.printf("%x\n", a ^ b); // XOR 연산
		System.out.printf("%x\n", ~a);    // NOT 연산

		byte c = 20; // 0x14
		byte d = -8; // 0xf8
		// 시프트 연산
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", d >>> 2);
	}

}
