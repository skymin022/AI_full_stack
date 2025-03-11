package Day02;

public class Ex05_Long {

	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32개 : 약 42억 개
		// int 수 표현 범위 		: -21억 xxx ~ 21억 xxx
		
		// long (8byte : 64bits) : 2^64개
		long ln1 = 100;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
//		long ln3 = 2200000000;
		// ** L을 붙이지 않은 경우 기본정수는 int 타입으로 인식되어 21억을 표현할 수 없다.
		
		
		System.out.println("ln1 :" + ln1);
		System.out.println("ln2 :" + ln2);
		System.out.println("ln3 :" + ln3);
		
	}
}



