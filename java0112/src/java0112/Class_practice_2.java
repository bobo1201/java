package java0112;

public class Class_practice_2 {
	public static void main(String[] args) {
		Car1 mycar1 = new Car1();
		Car1 mycar2 = new Car1();
		 	
		mycar1.color = "red";
		mycar2.color = "black";
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar2.color);
		System.out.println();
		System.out.println("mycar1의 속도 : " + mycar1.speed);
		System.out.println("mycar2의 속도 : " + mycar2.speed);
		System.out.println();
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);
		
		System.out.println();
		System.out.println(mycar1);
		System.out.println(mycar2);
	}
}

//	출력 : 
//	mycar1의 색 : red
//	mycar2의 색 : black
//	
//	mycar1의 속도 : 1
//	mycar2의 속도 : 0
//	
//	mycar1의 와이퍼 작동 여부 : false
//	mycar2의 와이퍼 작동 여부 : true
//	
//	java0112.Car1@15db9742
//	java0112.Car1@6d06d69c