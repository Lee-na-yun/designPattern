package adapter.ex01;

// 책임: 고객 클레임이 들어오면 사과 이메일 보내기
// 요구사항2: 이메일 답장을 DB에 저장하기
public class CustomerService {
	
	private EmailSend email; // 추상적인것에 의존 : EmailSend는 interface니까

	public CustomerService(EmailSend email) {
		this.email = email;
	}

	public void acceptClaim(String msg) { // 클레임 받는 메서드
		// 메서드는 하나의 책임만 가져야하므로 여기에 이메일 보내기를 적으면 안됨!! -> 메서드 따로 만들기
		
		//1.클레임받기
		String acceptMsg = msg;
		System.out.println("클레임 내용:" + acceptMsg);
		//2.이메일 보내기
		sendEmail(); // 책임이 없으므로 메서드를 따로 만들어서 호출하기만 하기
	}
	
	public void sendEmail() { // 이메일 보내는 메서드
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) { // 이메일 보내기 테스트
		System.out.println("답장을 디비에 저장했습니다.:" + result);
	}
}
