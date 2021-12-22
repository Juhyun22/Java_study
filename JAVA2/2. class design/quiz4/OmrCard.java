package Testing;

public class OmrCard {
	// 객관식. 문제 개수는 총 5개 
	// 학번과 이름 입력 
	// 학생의 답 5개를 입력받는 메소드 
	private String name;
	private String id;
	private int[] stuAns = new int[5];
	
	public OmrCard(String name, String id, int[] stuAns) {
		this.name = name;
		this.id = id;
		this.stuAns = stuAns;
	}

	public String setName() {
		return this.name;
	}
	
	public String setId() {
		return this.id;
	}
	
	public int[] setStuAns() {
		return this.stuAns;
	}

}
