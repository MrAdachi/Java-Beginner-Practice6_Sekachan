package practice;

class Car4 {
	private int no;
	private static int count = 0;
	
	public Car4() {
		no = 0;
		count++;
		System.out.println("ナンバーなしを作りました");
	}
	
	public Car4(int n) {
		no = n;
		count++;
		System.out.println("ナンバー" + no + "を作りました");
	}
	
	public static void display() {
		System.out.println(count + "台作成済です");
	}
}

public class Lesson9_4 {

	public static void main(String[] args) {
		// Carクラスのオブジェクトc1を生成
		Car4 c1 = new Car4();
		Car4.display();
		
		// Carクラスのオブジェクトc2を生成
		Car4 c2 = new Car4(2525);
		Car4.display();
		
		// Carクラスのオブジェクトc3を生成
		Car4 c3 = new Car4(8888);
		Car4.display();
	}

}
