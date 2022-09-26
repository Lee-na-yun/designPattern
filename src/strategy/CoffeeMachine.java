package strategy;

public class CoffeeMachine { // 객체를 사용하고 싶은데 상속이 안되므로(현재 다형성 성립안되서) 컴퍼지션하기 = 생성자주입 or 메서드주입

	public void brew(Coffee coffee) { // 커피 내리기
		System.out.println(coffee.make()); // 아메리카노 캡슐을 받아서 만들기
	}
	

}
