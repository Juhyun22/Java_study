package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO 객체 생성 및 값 넣기
		Person person = new Person();
		
		person.name = "Purple Bak";
		person.yyyymmdd = "19990202";
		person.gender = "boy";
		
		// 메소드 호출 
		person.Hello();
		person.Walking();
		person.Introduce();
		person.Age();
		
	}
}
