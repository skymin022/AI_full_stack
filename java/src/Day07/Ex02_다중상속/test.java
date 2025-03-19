package Day07.Ex02_다중상속;

public class test {
	
	public static void main(String[] args) {
		//배열 크가 5 생성
		int arr[] = new int[5];
		
		// 1~5 반복
		for (int i = 0; i < 5 ; i++) {
			System.out.println(i);
		}
		
		// 배열에 1~5 반복 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	
}



