package singleton;

public class App {

	public static void main(String[] args) {
		//President p1 =  new President("윤석열");
		President p1 = President.getInstance(); // 윤석열 // 객체가 1개만 가능해짐
		//President p2 =  new President("이재명");

	}

}
