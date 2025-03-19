package Day06.Review;

class Parent {
	Parent(){
	System.out.println("P1"); 
	}
	Parent(String str){
		System.out.println("P2"); 
	}
}

class child extends Parent {
	child() {
		System.out.println("C1");
	}
	child(String str) {
		System.out.println("C2");
	}
}

public class FamilyTest {
	public static void main(String[] args ) {
		child c1 = new child();
		child c2 = new child("a");
	}
}

	

	

