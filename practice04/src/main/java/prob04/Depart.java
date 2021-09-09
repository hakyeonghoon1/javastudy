package prob04;

public class Depart extends Employee{
	private String name;
	private int salary;
	private String depart;
	
	public Depart(String name, int salary, String depart) {
		super(name,salary);
		this.name=name;
		this.salary=salary;
		this.depart=depart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + name + "연봉:" + salary +"부서:"+depart);
	}
}
