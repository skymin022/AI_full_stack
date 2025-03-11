package Day02;

public class Ex15_TemaryOperator {

	public static void main(String[] args) {
		int a =3, b=5;
		
		// a와 b 두 수의 차이(절대값)을 구하시오.
		// a - b = -2
		// b - a = 2
		// 조건 연산자 (삼항 연산자)
		// - (조건) ? (참일 때 값) : 거짓일 떄 값
		int result = ( a > b ) ? a-b : b-a;
		//int result = ( a > b ) ? a-b : b-a;
		//				  (조건)	   (참)	 (거짓)
		System.out.println("두 수의 차 : " + result);
		
		
		// 조건 연산자를 if(조건문)으로 쓰면
		if ( a > b ) 
			result = a-b;
		else
			result = b-a;
			
		System.out.println("result : " + result);
			
		}
		
	}

