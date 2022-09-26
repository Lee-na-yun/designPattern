package adapter;

public class AmericanoAdapter implements Coffee{ // 타입 일치시키기
	
	private Americano americano; //컴퍼지션하고
	
	public AmericanoAdapter(Americano americano) { //생성자 주입
	this.americano = americano;
}

	@Override
	public String make() {
		System.out.println("시럽추가");
		return americano.make();
	}
}
