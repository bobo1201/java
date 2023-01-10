package java0109;

public class GarbageObjectExample {

	public static void main(String[] args) {
		
		String hobby = "여행";
		hobby = null;   // 여행 값을 참조하는 주소가 사라지게 됩니다.
		System.out.println("hobby : " + hobby);

		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;   // "자동차"를 참조하고 있던 주소 제거
		System.out.println("kind2 : " + kind2);
	}
}

//hobby : null
//kind2 : 자동차