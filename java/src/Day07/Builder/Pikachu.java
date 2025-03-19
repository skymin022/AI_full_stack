package Day07.Builder;
/*
 * 
 *  빌더 패턴
 *   : 복잡한 객체를 단계적으로 구성할 수 있도록 해주는 디자인 패턴
 *   
 */
public class Pikachu {

	// 변수
	private int energy;
	private String type;
	private int level;
	
	// private 생성자 (class 와 static class 를 연결)
	private Pikachu (Builder builder) {
		this.energy = builder.energy; 
		this.type = builder.type; 
		this.level = builder.level; 
	}
	
	// Builder 클래스를 static 클래스로 정의
	public static class Builder {
		private int energy;
		private String type;
		private int level;
		
		
		public Builder() {
			this(100, "", 1);
			
		}


		public Builder(int energy, String type, int level) {
			this.energy = energy;
			this.type = type;
			this.level = level;
		}
		
		
		// 각 변수를 초기화하고, 인스턴스를 반환하는 메소드 정의
		public Builder energy (int energy) {
			this.energy = energy;
			return this;
		}
		public Builder type (String type) {
			this.type = type ;
			return this;
		}
		public Builder level (int level) {
			this.level = level;
			return this;
		}
		
		// 객체를 생성해주는 메소드
		public  Pikachu build() {
			return new Pikachu(this);
		}


		}
	// toString
	@Override
	public String toString() {
		return "Builder [energy=" + energy + ", type=" + type + ", level=" + level + "]";
		
		
		
		
		
		
		
		
	}
	
	
}
