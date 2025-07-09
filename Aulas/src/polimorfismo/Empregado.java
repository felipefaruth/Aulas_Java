package polimorfismo;

public class Empregado {
	private String nome;
	private int hora;
	private double valorPorHora;
	
	
	public Empregado() {
	}

	public Empregado(String nome, int hora, double valorPorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento(){
		return valorPorHora * hora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(int valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
		
}