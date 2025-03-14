package Day05.Ex07_캡슐화;
/*
 *  통장 계좌
 *  - 예금액
 *  - 예금주
 *  - 계좌번호
 *  - 운행명
 * 
 */
public class Account {

	private int deposit;
	private String depositor;
	private String deponumber;
	private String bank;
	
	//기본생성자
	public Account() {
		this(0,"예금주 없음", "000000-00-000000", "은행없음");
	}

	//매개변수 생성자
	public Account(int deposit, String depositor, String deponumber, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.deponumber = deponumber;
		this.bank = bank;
	}

	// getter, setter
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		if (deposit <0 ) return;
		this.deposit = deposit;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public String getDeponumber() {
		return deponumber;
	}

	public void setDeponumber(String deponumber) {
		this.deponumber = deponumber;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	//toString
	@Override
	public String toString() {
		return "Account [deposit=" + deposit + ", depositor=" + depositor + ", deponumber=" + deponumber + ", bank="
				+ bank + "]";
	}

	
	
}
