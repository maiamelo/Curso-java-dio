package Curso.java.anatomia;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	
	public void ligar() {
		ligada = true;
	}
	public void aumentarVolume() {
		volume ++;
	}
	public void diminuirVolume() {
		volume--;
		
	}

}
