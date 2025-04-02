package Day16.Ex01_ByteStream;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class ByteTextInput {

	public static void main(String[] args) {
		// 바이트 스트림 클래스
		// FileInputStream 객체로 바이트 코드(이진 데이터)를 그대로 입력
		// -> 문자스트림 클래스는 데이터를 문자로 변환
		// -> 바이트 스트림 클래스는 데이터를 문자로 변화하는 작업을 직접해주지 않는다.
		
		byte[] data = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream("./src/Day15/Test.txt");
			
			int byteText = fis.read(data);
			// 텍스트 내용이 있는 경우에만 출력
			if (byteText != -1) {
				// 바이트 배열 data 를 인덱스 0부터 마지막 바이트(byteText)까지 
				// UTF-8 인코딩 타입 문자열로 변환
				String text = new String(data, 0, byteText, StandardCharsets.UTF_8);
				System.out.println(text);
			}
			fis.close();
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
}
