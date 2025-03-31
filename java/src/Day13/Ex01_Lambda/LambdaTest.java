package Day13.Ex01_Lambda;

/**
 *  익명 객체 
 *   - 익명 객체 자식
 *   - 익명 구현 객체
 *   
 *  익명 함수 
 *  
 */

// 익명 자식 객체의 부모 클래스 정의
class Television {
	void volumnup() {System.out.println("up");}
	void volumndown() {System.out.println("down");}
}

// 익명 구현 객체의 인터페이스 정의
interface RemoteControl {
	void volumnup();
	void volumndonw();
}

// 익명 함수를 위한 함수형 인터페이스 정의
@FunctionalInterface
interface Calculator {
	int calc(int a, int b);
}

public class LambdaTest {

	public static void main(String[] args) {
		// 익명 자식 객체
		Television tv = new Television() {

			@Override
			void volumnup() {
				System.out.println("익명 자식 객체 up - 구현");
				super.volumnup();
			}

			@Override
			void volumndown() {
				System.out.println("익명 자식 객체 down - 구현");
				super.volumndown();
			}
			
			
			
		};
		
//		 익명 구현 객체
		RemoteControl rc = new RemoteControl() {

			@Override
			public void volumnup() {
				System.out.println("익명 구현 객체 up - 구현");
			}

			@Override
			public void volumndonw() {
				System.out.println("익명 구현 객체 down - 구현");
			}
			
	
		};
		rc.volumnup();
		rc.volumndonw();
		
		// 익명 구현 객체2
		Calculator cal = new Calculator() {
			
			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};
		int result1 = cal.calc(10,20);
		System.out.println("result1 : " + result1);
		
		
		// 익명 함수 (람다식)
		Calculator calLambda = (a,b) -> {return a + b;};
		int result2 = calLambda.calc(30,40);
		System.out.println("result2 : " + result2);
		
	}
	
	
}
