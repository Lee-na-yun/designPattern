package strategy;

public class Americano implements Coffee {

	private final String NAME = "아메리카노"; // final로 정의한 문자는 대문자로!
	
	@Override
	public String make() { // 커피만들기
		return NAME;
	}
}
