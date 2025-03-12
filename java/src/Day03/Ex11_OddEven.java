package Day03;

public class Ex11_OddEven {

	public static void main(String[] args) {
		// 1~20 까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		// 1+3+5+7...
		// 2+4+6+8...
		
		int i=1;
		int a =0;
		int b =0;
		
		
		while (i<=20) {
			
			if (i%2==1) {
				a += i++;
			}else {
				b += i++;
			}
		}
		
		
//		while (i <=20) {
//			if (i%2==1) {
//				a += i;
//			}
//			if (i%2==0) {
//				b += i;
//				
//			}
//			i++;
//		}
		
		
		
//		while (i<=20 && i%2==0) {
//			a += i++;
//			
//		}
//		while (i<20 && i%2==1 ) {
//			b+= i++;
//		}
		
		
		System.out.println("홀수: "+ a);
		System.out.println("홀수: "+ b);
	
		
	}
}
