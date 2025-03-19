package Day08.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 *  test.txt 파일 입력하여 텍스트 파일의 내용을 출력하는 프로그램
 */

public class DirectClose {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		InputStreamReader in = null;
		
		// test.txt 파일을 입력할 수 있도록 연결
		// 파일 입력 FileInputStream
		// 파일 읽기 InputStreamReader
		
		try {
			fis = new FileInputStream("test.txt");
			in = new InputStreamReader(fis, "UTF-8");
			
			int read = 0;
			while ( (read = in.read()) != -1 ) {
				System.out.print( (char) read );
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("지원하지 않는 인코딩 타입입니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("입출력 관련 예외가 발생했습니다.");
		}
		
		// finally 부분을 자동 close 
		finally {
			if (fis != null) {
				try {
					fis.close();					// 메모리 해제
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();						// 메모리 해제
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
}
