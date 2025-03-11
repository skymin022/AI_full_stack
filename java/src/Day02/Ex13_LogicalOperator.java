package Day02;

public class Ex13_LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		// AND (&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		// or ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
		// NOT (!)
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		// 쇼트 서킷
		// : 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
		int value1 = 3;
		System.out.println(false && ++value1 > 10);
		System.out.println("value1 : " + value1);
		// 따라서 value1은 계산이 안된 상태이다.
		
		int value2 = 3;
		System.out.println(true || ++value2 > 10);
		System.out.println("value2 : " + value2);
		// 따라서 value1은 계산이 안된 상태이다.
		
		System.out.println();
		
		// 비트 연산자인 경우, 쇼트 서킷이 적용되지 않는다.
		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println("value3 : " + value3);
		
		int value4 = 3;
		System.out.println(false | ++value4 > 10);
		System.out.println("value4 : " + value4);
		
		System.out.println();
		
		int i =10, j =2;
		System.out.println(i & j);
		//	1010
		// 	0010
		// 	0010 => 2
		
		System.out.println(i | j);
		//	1010
		// 	0010
		//	1010 => 10
	}
	
}
