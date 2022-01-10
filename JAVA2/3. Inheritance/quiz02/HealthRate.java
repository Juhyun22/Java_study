package quiz02;

public class HealthRate extends HealthInfo {
	

	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}

	public double getNormalWeight() {
		return (this.height - 100) * 0.9;
	}

	public double getBMI() {
		return (this.weight - getNormalWeight()) / getNormalWeight() * 100;
	}
	
	public String isOk() {
		double rate = getBMI();
		
		if (rate < 10) {
			return "정상";
		} else if (rate < 20) {
			return "과체중";
		} else {
			return "비만";
		}
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("=> " + isOk() + "입니다.");
	}
}
