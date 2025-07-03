package herenca;

public class SavingAccount extends Account {
	
	private double taxaDeJuros;

	public void attSaldo() {
		saldo += saldo * taxaDeJuros;
	}
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(int num, String dono, double saldo, double taxaDejuros) {
		super(num, dono, saldo);
		this.taxaDeJuros = taxaDejuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	
}
