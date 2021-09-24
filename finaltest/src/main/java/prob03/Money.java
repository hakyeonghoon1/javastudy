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

		int result2 = this.amount - money.amount;

		return new Money(result2);
	}
	public Money multiply(Money money) {

		int result3 = this.amount * money.amount;

		return new Money(result3);
	}
	public Money devide(Money money) {

		int result4 = this.amount / money.amount;

		return new Money(result4);
	}
	
	public boolean equals(Money obj) {
		boolean result = false;
		if(obj instanceof Money) {
			if(this.amount==obj.amount) {
				result = true;
			}else {
				result = false;
			}
		}else {
			result = false;
		}
		return result;
	}
}
