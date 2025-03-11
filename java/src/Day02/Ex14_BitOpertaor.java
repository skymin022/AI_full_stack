package Day02;

public class Ex14_BitOpertaor {
	public static void main(String[] args) {
		
		//Integer.toBinaryString : 10진수 -> 2진수로 바꿔 달라 
		
		// AND
		int result = 20 & 16;
		System.out.println("20 & 16 = " + result);
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("----------------------------");
		System.out.println( Integer.toBinaryString(result));
		System.out.println();
		
		// OR
		int result2 = 20 | 16;
		System.out.println("20 | 16 = " + result2);
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("----------------------------");
		System.out.println( Integer.toBinaryString(result2));
		System.out.println();
		
		// XOR
		// 서로 값이 다르면 1(true), 같으면 0(false)
		int result3 = 20 ^ 16;
		System.out.println("20 ^ 16 = " + result3);
		System.out.println( Integer.toBinaryString(20) );
		System.out.println( Integer.toBinaryString(16) );
		System.out.println("----------------------------");
		System.out.println( Integer.toBinaryString(result3));
		System.out.println();
		
		// 왼쪽 시프트 연산 (<<)
		int a =5;
		System.out.println( Integer.toBinaryString(a));
		int result4 = a << 1;
		System.out.println( Integer.toBinaryString(result4));
		System.out.println("----------------------------------");
		System.out.println(result4);
	
		// 오른쪽 시프트 연산 (>>)
		int b = 10;
		int reuslt5 = b >> 2;
		System.out.println(reuslt5);
		
	}
}
