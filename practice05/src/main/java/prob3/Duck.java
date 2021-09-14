package prob3;

public class Duck extends Bird{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "오리의 이름은 " + name + " 입니다.";
	}
	
	public void fly() {
		System.out.println("오리("+this.name+")는 날지 않습니다.");
	}
	
	public void sing() {
		System.out.println("오리("+this.name+")가 소리내어 웁니다.");
	}
	
}
