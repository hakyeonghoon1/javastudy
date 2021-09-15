package prob03;

public class Money {
	private int amount;
	
	/* 코드 작성 */
	public Money(int a) {
		this.amount =a;
	}
	public Money add(Money money) {
		int result = this.amount + money.amount;
		
		return new Money(result);
	}
	public Money minus(Money money) {
		int result = this.amount - money.amount;
		return new Money(result);
	}
	public Money multiply(Money money) {
		int result = this.amount * money.amount;
		return new Money(result);
	}
	public Money devide(Money money) {
		int result = this.amount / money.amount;
		return new Money(result);
	}
}
