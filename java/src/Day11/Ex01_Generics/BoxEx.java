package Day11.Ex01_Generics;

import java.util.Iterator;

import Day05.Ex04_상속.Pikachu;

public class BoxEx {

	public static void main(String[] args) {
		// 제네릭 
		// - 구조 : class 클래스명<타입매개변수1, 타입매개변수2> { }
		// - 예시 : class Box <T> { }
		// - 생성 : Box<타입> box = new Box<클래스>();
		
		Box<String> box1 = new Box<String>();
		box1.setT("물");
		String boxName = box1.getT();
		System.out.println("Box1 : " + boxName);
		
		Box<Pikachu> monsterBall = new Box<Pikachu>();
		monsterBall.setT(new Pikachu());
		Pikachu pikachu = monsterBall.getT();
		System.out.println("Pikachu : " + pikachu);
		
//		(에러) Box<int> numberBox = new Box<int>();
		// * 제너릭 기법의 타입으로는 "참조자료형"만 사용할 수 있다.
		// * 기본타입은 지정할 수 없다.
		Box<Integer> numberBox = new Box<Integer>();
		numberBox.setT(100);
		System.out.println("numberBox : " + numberBox.getT());
		
		
		Box<int[]> snackBox = new Box<int[]> ();
		snackBox.setT( new int[] {1,2,3,4,5} );
		int[] snakArr = snackBox.getT();
		for(int i : snakArr) {
			System.out.println(i + " ");
		}
		System.out.println();
		
	}
	
}

