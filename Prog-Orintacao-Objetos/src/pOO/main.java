package pOO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();
		
		carro1.setCor("verde");
		carro1.setModelo("BMW");
		carro1.setCapacidadeTanque(59);
		
		
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.totalValorTanque(6.39));
		
		
		Carro carro2 = new Carro("Cinza", "BMW", 66);
		

		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.totalValorTanque(6.88));

	}

}
