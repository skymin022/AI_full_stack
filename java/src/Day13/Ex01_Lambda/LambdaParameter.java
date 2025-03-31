package Day13.Ex01_Lambda;

/**
 *  매개변수 있는 람다식
 *   - 최댓값
 *   - 합계
 */

@FunctionalInterface
interface SmartCalc {
	int calc(int x, int y);
	
}


public class LambdaParameter {

	public static void main(String[] args) {
		
		
		
		// 최댓값 	: x,y 중 가장 큰 값
		SmartCalc sc1 = (x,y) -> { return (x>y) ? x : y; };
		
				
		
		// 합계 		: 정수 x ~ y 까지의 합계 
		// 방법 1
		SmartCalc sc2 = (x,y) -> {return (x>y) ? (x+y)*(x-y)/2 : (x+y)*(y-x)/2;};
		
		// 방법 2
		SmartCalc sc3 = (x,y) -> {
			int sum =0;
			for (int i = x; i <= y; i++) {
				sum +=i;
			}
			return sum;
		};
		
		
		int result1 = sc1.calc(100,50);
		int result2 = sc2.calc(1, 5);
		int result3 = sc2.calc(1, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		// 익명함수를 메소드에 전달하여 사용할 수도 있다.
		smartCalc(sc1, 10, 20);
		smartCalc(sc2, 1, 5);
		smartCalc(sc3, 1, 5);
		
		
	}
	
	// Q : (익명함수, 람다식)를 메소드에 전달할 수 있나요?
	// A : 람다식으로 정의한 익명함수는 인터페이스타입으로 전달할 수 있다. 
	public static void smartCalc(SmartCalc sm, int a, int b ) {
		int result = sm.calc(a, b);
		System.out.println("result : " + result);
	}
	
	
}
