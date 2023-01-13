package java0112;

class Car2 {
	static int wheel = 4;
	int speed;
}

public class Class_practice_3 {
	public static void main(String[] args) {
		
		System.out.println(Car2.wheel);
		// System.out.println(Car1.speed);
				
		Car2 mycar1 = new Car2();
		
		System.out.println(Car2.wheel);
		System.out.println(mycar1.speed);
		
		Car2 mycar2 = new Car2();
		
		System.out.println("<변경 전>");		
		System.out.println("mycar1.speed : " + mycar1.speed);
		System.out.println("mycar2.speed : " + mycar2.speed);
		System.out.println("mycar1.wheel : " + mycar1.wheel);
		System.out.println("mycar2.wheel : " + mycar2.wheel);
		
		mycar2.speed = 100;
		mycar2.wheel = 5;
		
		System.out.println("<변경 후>");		
		System.out.println("mycar1.speed : " + mycar1.speed);
		System.out.println("mycar2.speed : " + mycar2.speed);
		System.out.println("mycar1.wheel : " + mycar1.wheel);
		System.out.println("mycar2.wheel : " + mycar2.wheel);
	}
}

//	출력 : 
//	4
//	4
//	0
//	<변경 전>
//	mycar1.speed : 0
//	mycar2.speed : 0
//	mycar1.wheel : 4
//	mycar2.wheel : 4
//	<변경 후>
//	mycar1.speed : 0
//	mycar2.speed : 100
//	mycar1.wheel : 5
//	mycar2.wheel : 5