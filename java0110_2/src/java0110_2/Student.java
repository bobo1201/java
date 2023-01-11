package java0110_2;

public class Student {
	String name;
	int assignmentsScore;
	int examScore;
	char grade;
	
	public String toString(){
		String str = "" ;
		
		int score = (int)(this.assignmentsScore * 0.4 + this.examScore * 0.6) / 10; 
		
		switch(score) {
		case 9 :
			this.grade = 'A';
			break;
		case 8 :
			this.grade = 'B';
			break;
		case 7 :
			this.grade = 'C';
			break;
		case 6 :
			this.grade = 'D';
			break;
		default :
			this.grade = 'F';
			break;
		}
		
		str += "이름 : " + this.name + "\n과제 점수 : " + assignmentsScore + "\n시험 점수 :"
				+ this.examScore + "\n학점 : " + this.grade + "\n";
		
		return str;
	}
}

//public class Student {
//	String name;
//	int assignmentsScore;
//	int examScore;
//	
//	public char getGrade() {
//		
//		int score = (int)(this.assignmentsScore*0.4 + this.examScore*0.6)/10;
//		char grade;
//		
//		switch(score) {
//			case 9 :
//				grade = 'A';
//				break;
//			case 8 :
//				grade = 'B';
//				break;
//			case 7 :
//				grade = 'C';
//				break;
//			case 6 :
//				grade = 'D';
//				break;
//			default :
//				grade = 'F';
//				break;
//		}
//		return grade;
//	}
//	
//	public String toString(){
//		String str = "" ;
//		str += "이름 : " + this.name + "\n";
//		str += "과제 점수 : " + this.assignmentsScore + "\n";
//		str += "시험 점수 : " + this.examScore + "\n";
//		str += "학점 : " + getGrade() + "\n";
//		return str;
//	}
//}
