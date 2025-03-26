package Day13.Ex02_Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(90);
		list.add(60);
		list.add(80);
		list.add(70);
		
		// reduce 연산
		// reduce (초기값, (누적값, 현재요소) -> 수식)
		// : 모든 스트림 요소를 하나의 값으로 누적해서 줄이는 연산
		int result = list.stream()
							.reduce(0, (sum,a) -> sum + a);
		System.out.println("result : " + result);
		
		//-------------------------------------------
		System.out.println();
		List<String> wordList = new ArrayList<String>();
		wordList.add("안녕하세요~!");
		wordList.add("1시간 뒤면");
		wordList.add("집에 갈 시간 입니다.");
		wordList.add("집에 가서 뭐하실 건가요?");
		
		String msg = wordList.stream().reduce("", (a,b) -> a + " " + b);
		System.out.println(msg);
		System.err.println();
	}
	
	
}
