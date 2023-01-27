package search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<String> scores = new TreeSet<>();
		
		// Integer 객체 저장
		scores.add("abc");
		scores.add("agh");
		scores.add("bed");
		scores.add("rgb");
		scores.add("acc");
		
		// 정렬된 Integer 객체를 하나씩 가져오기
		for(String s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// 특정 Integer 객체를 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower("95"));
		System.out.println("95점 위의 점수 : " + scores.higher("95"));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor("95"));
		System.out.println("85점이거나 바로 위의 점수 : " + scores.ceiling("85") + "\n");
		
		// 내림차순으로 정렬하기
		// 오름차순 : ASC, 내림차순 : DESC
		NavigableSet<String> descendingScores = scores.descendingSet();
		for(String s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// 범위 검색(80 <= )
		NavigableSet<String> rangeSet = scores.tailSet("80", true);
		for(String s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		// 범위 검색 (80 <= score < 90)
		rangeSet = scores.subSet("80", true, "90", false);
		for(String s : rangeSet) {
			System.out.print(s + " ");
		}

	}

}
