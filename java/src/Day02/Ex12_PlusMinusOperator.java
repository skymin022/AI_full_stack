package Day02;

public class Ex12_PlusMinusOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		// 증감 연산자
		// ++a, a++		:a를 1 증가
		// --a, a--		:a를 1 감소
		
		// 전위 연산자		: 연산자 우선순위가 가장 높다. (++a, --a)
		
		c = ++a + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int x = 10, y = 20, z;
		
		// 후위 연산자 	: 연산자 우선순위가 가장 낮다. (a++, a--)
		z = x++ + y;
		System.out.println("z = " +z);
		System.out.println("x = " +x);
		
		// c = 31, z = 30
	}
}
