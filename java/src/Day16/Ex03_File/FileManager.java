package Day16.Ex03_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *  - 메뉴 출력 메소드
 *  - 폴더 내의 파일 목록
 *  - 파일 정보 조회
 *  - 폴더 생성
 *  - 파일 생성 
 *  - 파일 삭제
 *  - 폴더 삭제
 *  
 */
public class FileManager {
	
	/**
	 * 메뉴 출력 메소드
	 */
	private void menu() {
		System.out.println("::::::::: 파일 관리 :::::::::");
		System.out.println("1. 파일 목록");
		System.out.println("2. 파일 조회");
		System.out.println("3. 폴더 생성");
		System.out.println("4. 폴더 삭제");
		System.out.println("5. 파일 생성");
		System.out.println("6. 파일 삭제");
		System.out.println("0. 프로그롬 종료");
		System.out.println(":::::::::: 번호 : ");
	}
	
	/**
	 * 파일 목록
	 * @param path
	 */
	private void fileList(String path) {
		System.out.println(path);
		File file = new File(path);				// 경로를 지정하여 파일 객체 생성
		File[] fileList = file.listFiles(); 	// 하위 경로의 파일 목록을 File[]배열로 반환
		System.out.println("------------------------------");
		
		System.out.println("파일명\t\t용량\t\t수정일자");
		for (File subFile : fileList) {
			long update = subFile.lastModified();	// 최종 수정일자
			Date date = new Date(update);			// java.util.Date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String updateDate = sdf.format(date);
			// 파일명
			String fileName = subFile.getName();
			// 용량
			long size = subFile.length();
			System.out.print(fileName + "\t\t");
			System.out.print(size + "\t\t");
			System.out.print(updateDate + "\t\t");
			System.out.println();
		}
		System.out.println("---------------------------");
	}

	/**
	 * 파일 정보 조회
	 * @param filePath
	 */
	private void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.print("파일 종류 : ");
		if (file.isDirectory() ) System.out.println("디렉토리");
		if (file.isFile() ) System.out.println("일반파일");
		
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate =sdf.format(date);
		
		System.out.print(file.getName() + "\t\t");
		System.out.print(file.length() + "\t\t");
		System.out.print(updateDate + "\t\t");
		System.out.println();

	}
	
	/**
	 * 폴더 생성
	 * @param path
	 */
	private void makeDirectory(String path) {
		File file = new File(path);
		 
		// 폴더 생성
		// mkdir() 		: 생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야한다. (없으면 에러)
		// mkdirs()		: 생성할 경로의 상위 경로까지 디렉토리를 생성해준다. 
		if(file.mkdirs() ) {
			System.out.println("디렉토리 생성 성공!");
		} 
		else {
			System.out.println("디텍토리 생성 실패!");
		}
		
		System.out.println("경로 : " + path);
	}
	
	/**
	 *  폴더 삭제
	 * @param path
	 */
	private void deleteDirectory(String path) {
		//TODO : 지정 폴더 하위 경로에 다른 파일이 있으면, 먼저 삭제
		// 		 폴더 안에 폴더가 있으면 -> 재귀호출로 삭제 
		// 1. 하위 경로에 파일들 삭제
		// 2. 해당 폴더 삭제
		
		File file = new File(path);
		File[] fileList = file.listFiles();
		
		// 하위 경로에 파일이 있으면, 하위 파일을 먼저 삭제
		if(fileList != null) {
			for (File subFile : fileList) {
				String subFilePath = subFile.getPath();
				// 재귀 호출(재귀 함수: recursive)
				deleteDirectory(subFilePath);
			}
		}
		
		if (file.delete() ) {
			System.out.println("폴더(파일) 삭제 성공!");
		}
		else {
			System.out.println("폴더(파일) 삭제 실패!");
		}
	}
	
	/**
	 * 파일 생성
	 * @param path		// 파일을 생성할 경로
	 * @param fileName	// 파일명
	 */
	private void createFile(String path, String fileName) {
		//TODO : FileWriter 객체를 사용하여 간단한 텍스트를 입력하여 지정한 파일로 출력하시오.
		// 1. File 객체 생성
		// 2. File 객체를 초기화는 FileWriter 객체 생성
		// 3. 사용자로부터 문자열 입력
		// 4. 입력받은 문자열을 지정한 파일에 출력
		// 5. *예외 처리
		
		File file = new File(path, fileName);
		try  
			{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			Scanner sc = new Scanner(System.in);
			System.out.print("저장할 내용을 입력하세요 >> ");
			String content = sc.nextLine();
			bw.write(content);
			bw.close();
			sc.close();
			System.out.println("입력받은 문자열을 "+fileName +" 에 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 *  파일 삭제
	 * @param filePath
	 */
	private void deleteFile(String filePath) {
		File file = new File(filePath);
		
		// 파일 존재 여부 확인
		if(file.exists() && file.delete() ) {
			System.out.println("파일 삭제 성공!");
		} 
		else if (file.exists() ) {
			System.err.println("파일 삭제 실패!");
		}
		else {
			System.err.println("파일이 존재하지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		FileManager fm = new FileManager();
		Scanner sc = new Scanner(System.in);
		
		int menuNo; 			// 메뉴 번호
		
		do {
			//TODO: 정의한 메소드 기능을 활용하여 관리 프로그램이 실행되도록 완성해보세요.
			// 메뉴판 출력
			fm.menu();
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			sc.nextLine(); // 엔터 지우기
			
			// 0 번 -> 종료
			if(menuNo ==0) break;
			// 파일 경로 
			
			// 파일 경로 입력
			System.out.print("파일 경로 :");
			String path = sc.nextLine();
			
			// 메뉴 선택
			switch (menuNo) {
//			 *  - 파일 목록
			case 1:  fm.fileList(path);	break;
//			 *  - 파일 조회
			case 2:  fm.fileInfo(path); break;
//			 *  - 폴더 생성
			case 3:  
				fm.makeDirectory(path); break;
//			 *  - 폴더 삭제
			case 4:  fm.deleteDirectory(path); break;
//			 *  - 파일 생성 
			case 5:  
			System.out.print("파일 이름 입력 :");
			String fileName =sc.nextLine();
			fm.createFile(path, fileName); break;
//			 *  - 파일 삭제
			case 6:  fm.deleteFile(path); break;
			}
			
			
		} while (true);
		
	}
	
	
	
}
