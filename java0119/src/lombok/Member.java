package lombok;

import lombok.Data;

@Data	
// 어노테이션 : 기본 생성자와 함께 Getter, Setter, hashCode(), equals(), to String() 자동 생성
@NoArgsConstructor			// 기본 (매개변수가 없는) 생성자 포함
@AllArgsConstructor			// 모든 필드를 초기화 시키는 생성자 포함

public class Member {
	private String id;
	private String name;
	private int age;
}


//	@NoArgsConstructor			// 기본 (매개변수가 없는) 생성자 포함
//	@AllArgsConstructor			// 모든 필드를 초기화 시키는 생성자 포함
//	@RequiredArgsConstructor	// 기본적으로 매개변수가 없는 생성자 포함
//								// 만약 final 또는 @NotNull이 붙은 필드가 있다면 이 필드만 초기화 시키는 생성자 포함
//	
//	@Getter						// Getter 메소드 포함
//	@Setter						// Setter 메소드 포함
//	@EqualsAndHashCode			// equals()와 hashCode() 메소드 포함
//	@ToString					// toString() 메소드 포함
