package Curso.java.filas;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("Primeiro"));
		minhaFila.enqueue(new No("Segundo"));
		minhaFila.enqueue(new No("Terceiro"));
		minhaFila.enqueue(new No("Quarto"));
		
		
		
		System.out.println(minhaFila);
		
		
		System.out.println(minhaFila.dequeue());
		minhaFila.enqueue(new No("Ultimo"));
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila.dequeue());
		
		//System.out.println(minhaFila.first());
	
	
		System.out.println(minhaFila);

	}

}
