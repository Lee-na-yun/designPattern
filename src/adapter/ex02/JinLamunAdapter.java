package adapter.ex02;

public class JinLamunAdapter implements Lamun{

	 private Jinlamun jinlamun;   
	   
	   public JinLamunAdapter(Jinlamun jinlamun) {
	      this.jinlamun = jinlamun;
	   }

	   @Override
	   public void cook() {
	      jinlamun.cook();
	      System.out.println("계란 추가");
	      System.out.println("파 추가");
	   }

	
}
