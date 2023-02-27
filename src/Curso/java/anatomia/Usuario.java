package Curso.java.anatomia;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv ligada? " + smartTv.ligada );
		System.out.println("Canal atual? " + smartTv.canal );
		System.out.println("Volume atual? " + smartTv.volume);
		
		
		smartTv.ligar();
		System.out.println("TV ligada " + smartTv.ligada);
		
	
		System.out.println("Diminuindo volume da TV " + smartTv.volume);
		
	}

}
