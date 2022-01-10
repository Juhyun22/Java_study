package quiz02;

public class HealthTest {

	public static void main(String[] Args) {
		HealthRate person1 = new HealthRate("박둘리", 160, 45);
		person1.showInfo();
		
		HealthRate person2 = new HealthRate("홍길동", 168, 90);
		person2.showInfo();
	}
}
