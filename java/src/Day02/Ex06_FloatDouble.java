package Day02;

public class Ex06_FloatDouble {

	public static void main(String[] args) {
		
		//실수 타입 변수 선언
		// float 타입 리터럴 		: 실수F
		// double 타입 리터럴 		: 실수D
		// * double 타입 리터럴 D는 생략 가능
		
		double var1 = 3.14;
		double var2= 3.14d;
		
		float var3 = 3.14f;
		
		// 실수형 정밀도
		//double	: 16~17자리 표현
		//float		: 7~8자리 표현
		double var4 = 0.123456789123456789d;
		float var5 = 0.123456789123456789f;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
	}
}
