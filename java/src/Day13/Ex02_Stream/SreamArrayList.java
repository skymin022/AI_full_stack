package Day13.Ex02_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Product {
	String name;
	int price;
}

public class SreamArrayList {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		// 에너지 드링크
		productList.add( new Product("몬스터에너지", 2300) ); 
		productList.add( new Product("레드불", 2500) ); 
		productList.add( new Product("핫식스", 1800) ); 
		productList.add( new Product("스누피커피우유", 1800) ); 
		productList.add( new Product("아르포텐", 3000) ); 
		
		// map - 매핑
		// : 스트림 요소를 사용하려는 형태로 변환하는 연산
		// * 이름(name)만 추출(매핑)하여 반복
		productList.stream()
					.map( (product) -> {return product.getName(); } )
					.forEach( name -> System.out.println(name) );
		System.out.println();
		
		// * 가격(price)만 추출(매핑)하여 반복
		productList.stream()
					.map( (product) -> {return product.getPrice() +"원"; } )
					.forEach( price -> System.out.println(price));
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		
		// 메소드 참조 :: 로 작성
		productList.stream()
		.map( Product :: getName)
		.forEach(System.out::println);
		System.out.println();
		
		productList.stream()
		.map( Product :: getPrice)
		.forEach( System.out::println);
		System.out.println();
		
		// filter - 필터
		// : 스트림 요소에서 조건에 맞는 요소만 선택하는 연산
		// * 가격이 2000원 이상인 상품만 필터링하여 반복
		System.out.println("가격 2000 ↑");
		productList.stream()
					.filter( p -> p.getPrice() > 2000)
					.map(Product::getName)
					.forEach( p -> System.out.println(p));
		System.out.println();
		
		// * 상품명이 3글자인 상품만 필터링하여 반복
		System.out.println(" 상품명 3글자 ↑");
		productList.stream()
					.filter( p -> p.getName().length() >=3)
					.forEach( p -> System.out.println(p));
		System.out.println();
		
		// sorted - 정렬
		// : 스트림 요소에서 지정한 기준에 따라 요소들을 
		// 오름/내림 차순으로 정렬하는 연산
		
		// 이름 순 - 오름 
		System.out.println("이름 순 오름 정렬");
		productList.stream()
//					.sorted(Comparator.comparing( p -> p.getName() ))	// 기준
					.sorted(Comparator.comparing( Product::getName ))	// 기준
					.forEach( p -> System.out.println(p));
		System.out.println();
		
		// 이름 순 - 내림
		System.out.println("이름 순 내림 정렬");
		productList.stream()
//					.sorted(Comparator.comparing( p -> p.getName() ))	// 기준
					.sorted(Comparator.comparing( Product::getName ).reversed())	// 기준
					.forEach( p -> System.out.println(p));
		System.out.println();
		
		// 가격 순 - 오름 
		System.out.println("가격 순 오름 정렬");
		productList.stream()
//					.sorted(Comparator.comparing( p -> p.getPrice() ))	// 기준
					.sorted(Comparator.comparing( Product::getPrice ))	// 기준
					.forEach( p -> System.out.println(p));
		System.out.println();
		
		// 가격 순 - 내림 
		System.out.println("가격 순 내림 정렬");
		productList.stream()
//					.sorted(Comparator.comparing( p -> p.getPrice() ))	// 기준
		.sorted(Comparator.comparing( Product::getPrice ).reversed())	// 기준
		.forEach( p -> System.out.println(p));
		
		// count() - 스트림 요소 개수
		// * 이름이 4글자 이상인 상품의 개수
		long count = productList.stream()
								.filter( p -> p.getName().length() >=4 )
								.count();
		System.out.println("이름이 4글자 이상인 사람들의 수 : " + count);
		
		
		// sum() - 스트림의 합계 
		// * 가격이 2000원 미만인 상품들의 가격 합계
		int sum = productList.stream()
							.filter(p -> p.getPrice() < 2000) 
							.mapToInt(p -> p.getPrice())
							.sum();
		System.out.println("가격이 2000원 미만인 상품들의 가격의 합계 : " + sum);
		
		
	}
}












