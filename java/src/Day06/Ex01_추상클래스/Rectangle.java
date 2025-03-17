package Day06.Ex01_추상클래스;

// * 추상 클래스의 추상 메소드를 구현클래스에서 반드시 오버라이딩 해야한다.
public class Rectangle extends Shape{

	double width, height;
	
//	기본 생성자
	public Rectangle() {
		this(0.0, 0.0);
	}


//	매개변수 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}





	@Override
	double area() {
		// 사각형의 넓이 = (가로)X(세로
		return width*height;
	}

	@Override
	double round() {
		// 사각형의 둘레 = (가로 + 세로) *2
		return (width+height)*2;
	}


//	getter & setter
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


//	toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
	
	
}
