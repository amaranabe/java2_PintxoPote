import java.util.ArrayList;

class Cuenta {

	private ArrayList <PintxoPote> cuenta;

	//Metodos getter/setter
	
	public ArrayList <PintxoPote> getCuenta() {
		return cuenta;
	}

	public void setCuenta(ArrayList <PintxoPote> c) {
		this.cuenta=c;
	}


	// metodo imprimir en pantalla

	public void mostrar(ArrayList <PintxoPote> m) {

		int i;
		for (i=0; i<m.size(); i++) {
			System.out.println();
			System.out.println("El pintxo pote número "+(i+1)+" es:");
			System.out.println("===================================");
			System.out.println("Pintxo: "+m.get(i).getPintxo().getNombre());
			System.out.println("Pote:   "+m.get(i).getPote().getNombre());
			System.out.println("Precio: "+m.get(i).getPrecio());
			
		}

	}


}