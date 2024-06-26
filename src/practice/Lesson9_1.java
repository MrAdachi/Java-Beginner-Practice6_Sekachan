package practice;

class Car1 {
	int no;
	int speed;
	
	void setNo(int n) {
		no = n;
	}
	
	void run(int s) {
		speed = s;
	}
	
	void brake() {
		speed = 0;
	}
	
	void brake(int s) {
		speed -= s;
	}
	
	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}

public class Lesson9_1 {

	public static void main(String[] args) {
		// Carクラスのオブジェクトc1を生成
		Car1 c1 = new Car1();
		
		// c1のナンバーを2525に設定
		c1.setNo(2525);
		
		// c1の速度を30に設定
		c1.run(30);
		
		// c1のナンバー、速度を表示
		c1.display();
		
		// c1の速度を減速
		c1.brake(10);
		
		// c1のナンバー、速度を表示
		c1.display();

	}

}
