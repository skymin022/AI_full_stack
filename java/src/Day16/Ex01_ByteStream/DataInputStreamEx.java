package Day15.Ex01_ByteStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx {

	public static void main(String[] args) {
		// 파일 경로
		String filePath = "sample.dat";
		
		try (
				// FileInputStream 객체를 사용하여, 파일을 byte 단위로 입력
				FileInputStream fis = new FileInputStream(filePath);
				
				// BufferedInputStream 객체를 사용하여, 파일 입력 성능 향상
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				// DataInputStream 객체를 사용하여 기본데이터 타입을 입력
				DataInputStream dis = new DataInputStream(bis);
			){
				// 데이터 입력
				int num = dis.readInt();
				double num2 = dis.readDouble();
				boolean check = dis.readBoolean();
			
			System.out.println("num : " + num);
				System.out.println("num2 : " + num2);
				System.out.println("check :" + check);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
				
	}
	
}
