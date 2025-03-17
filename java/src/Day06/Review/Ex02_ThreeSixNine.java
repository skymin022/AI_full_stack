package Day06.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수 1~100까지 수를 반복하여 출력하면서,
		//해당 수 가 3,6,9가 될 때는
		// 자리수 마다 3,6,9가 되는 개수 만큼 정수에 대한 
		// "*"를 출력하는 프로그램을 작성하시오.
		
		// ex). 13 : *
		// ex). 33 : **
		
		
		// 순서도
		// 1. 정수 1~100 반복 및 출력
		// 2. 해당 수의 369가 몇개인지 판단
		// 2-1. 십의자리수가 369인지 (A)
		// 2-1. 일의자리수가 369인지 (B)
		// 3. 369 개수에 따라 출력
		// A and B -- > **
		// A or B -- > *
		// 그 외 --> 정수
		
		// 1
		for (int i = 0; i <= 100; i++) {
			// i : 1~100
			// ex) i : 16
			// 십의 자리수 : i/10
			// 일즤 자리수 : i%10
			
			int ten = i/10;
			int one = (i%10);

			// ten 이 '0'이 아닌 수에서만 적용
			if ((ten != 0 && ten % 3 == 0) && (one != 0 && one % 3 == 0)) {
				System.out.println("**");
			} else if ((ten != 0 && ten % 3 == 0) || (one != 0 && one % 3 == 0)) {
				System.out.println("*");
			} else
				System.out.println(i);
			
			
			// 수식이 길어짐으로 true / false 로 변경해서 확인
		
//			boolean ten369 = (ten != 0 && ten % 3 == 0);
//			boolean one369 = (ten != 0 && ten % 3 == 0);
			// or 
//			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
//			boolean one369 = oen == 3 || oen == 6 || oen == 9;
			
			
//			if (ten369 && one369) {
//				System.out.println("**");
//			} else if (ten369 || one369) {
//				System.out.println("*");
//			} else
//				System.out.println(i);
			
			
			
			
			
			
			
		}
		

		
		

	
		
		// 2. 자리수
		
		
	}
	
}
