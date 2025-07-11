package classe_abstrata;

public class Circulo extends Forma{
	private double raio;

	
	public Circulo() {
		super();
	}
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.sqrt(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
