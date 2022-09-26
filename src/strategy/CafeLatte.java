package strategy;

public class CafeLatte implements Coffee{

	private final String NAME = "카페라떼"; // final로 정의한 문자는 대문자로!
	
	@Override
	public String make() { // 커피만들기
		return NAME;
	}
}
