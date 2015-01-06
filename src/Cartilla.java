class Cartilla {

	public Cartilla() {
		sellos = new boolean [10];
		int i;
		for (i=0; i<sellos.length; i++) {
			sellos[i]=false;
		}
	}

	private boolean[] sellos; //array de 10, para guardar los sellos, cada, item sera un bar

	//Crear método sellar

	public void sellar(boolean s) {

		int i;
		boolean sello;
		for (i=0; i<sellos.length; i++) {
			
		}
	}

	//Crear metodo descuento
	
	public void descuento(PintxoPote pp) {
		
		double preciodescuento;
		int contador=0;
		int i;
		for (i=0; i<sellos.length; i++) {
			if (sellos[i]==true) {
				contador=contador+1;
			}
		if (contador >6 && contador <=8) {
			preciodescuento=pp.getPrecio()*0.75;
		}
		else if (contador>8) {
			preciodescuento=pp.getPrecio()*0.50;
		}
		else {
			preciodescuento=pp.getPrecio()*1;
		}

		}
		
	}	 


}