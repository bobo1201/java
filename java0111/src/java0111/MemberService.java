package java0111;

public class MemberService {
	
	public static void main(String[] args) {
		MemberService memberServiece = new MemberService();
		
		boolean result = memberServiece.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberServiece.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;			
		} else {
			return false;				
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
