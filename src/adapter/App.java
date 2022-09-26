package adapter;

public class App { // 커피머신에 접근해서 커피 내리기 = 아메리카노를 몰라도 됨!

	public static void main(String[] args) {
		CoffeeMachine m = new CoffeeMachine();
		m.brew(new Americano()); // 아메리카노 캡슐 넣기
		m.brew(new CafeLatte());
		m.brew(new Espresso());
		m.brew(new AmericanoAdapter(new Americano()));
	}

}
