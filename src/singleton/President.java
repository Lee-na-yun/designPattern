package singleton;

public class President {
	
	private static President instance = new President("윤석열"); // president 클래스의 static공간에 변수가 저장되고 new는 힙에 뜸
	public static President getInstance() { //getter 만들기 --> heap에 뜸
		return instance;
	}

	private String name;
	
	private President(String name) {
		this.name = name;
	}
}
