package pOO;

public class Carro {

	String cor;
	String modelo;
	int capacidadeTanque;
	
	Carro(){
		
	}

	public Carro(String cor, String modelo, int capacidadeTanque) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
		
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
}
