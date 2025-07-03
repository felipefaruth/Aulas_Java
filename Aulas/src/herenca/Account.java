package herenca;

public class Account {
	
	private int num;
	private String dono; 
	protected double saldo;
	
	public Account() {
	}

	public Account(int num, String dono, double saldo) {
		this.num = num;
		this.dono = dono;
		this.saldo = saldo;
	}

	public void saque(double v) {
		saldo -= v;
	}
	
	public void deposito(double v) {
		saldo += v;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}
