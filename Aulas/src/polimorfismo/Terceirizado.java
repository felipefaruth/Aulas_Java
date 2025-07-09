package polimorfismo;

public class Terceirizado extends Empregado{
	
	private double adicional;

	
	public Terceirizado() {
	}
	
	public Terceirizado(String nome, int hora, double valorPorHora, double adicional) {
		super(nome, hora, valorPorHora);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}


	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public Double pagamento(){
		return super.pagamento() + adicional * 1.1;
	}
}
