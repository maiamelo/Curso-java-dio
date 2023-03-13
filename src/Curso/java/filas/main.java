package Curso.java.filas;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila<String> minhaFila = new Fila<>();
		
		minhaFila.enqueue("Primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("Quarto");
		
		
		
		System.out.println(minhaFila);
		
		
		System.out.println(minhaFila.dequeue());
		minhaFila.enqueue("Ultimo");
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila.dequeue());
		
		//System.out.println(minhaFila.first());
	
	
		System.out.println(minhaFila);

	}

}
