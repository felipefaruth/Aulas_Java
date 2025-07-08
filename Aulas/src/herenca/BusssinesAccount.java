package herenca;

public class BusssinesAccount extends Account {
	
	private double limiteDeEmprestimo;
	
	
	
	public BusssinesAccount() {
		super();
	}

	public BusssinesAccount(int num, String dono, double saldo, double limiteDeEmprestimo) {
		super(num, dono, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	@Override
	public void saque(double v) {
		super.saque(v);
		saldo -= 2;
	}

	public void emprestimo(double v) {
		if (v <= limiteDeEmprestimo){
			this.deposito(v);
		}else {
			System.out.println("Não é possivel fazer emprestimo.");
		}
	}

	public double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
}
