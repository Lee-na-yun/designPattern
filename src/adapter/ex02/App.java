package adapter.ex02;

public class App {

	public static void main(String[] args) {
		JinLamunAdapter j = new JinLamunAdapter(new Jinlamun());
		j.cook();
	}

}
