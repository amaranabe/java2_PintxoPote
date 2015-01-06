import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;


class Main {

	public static void mostrarlistados (ArrayList<Pintxo> pp) {
		int index;
		System.out.println("El listado de pintxos es el siguiente: ");
		for (index=0; index<pp.size(); index++ ) {
			System.out.println("");
			System.out.println("Pintxo número: " +(index+1));
			pp.get(index).mostrarpintxo();
		}
	}

	public static void mostrarlistadopotes (ArrayList<Pote> ppt) {
		int index;
		System.out.println("El listado de bebidas es el siguiente: ");
		for (index=0; index<ppt.size(); index++ ) {
			System.out.println();
			System.out.println("Pote número: "+(index+1));
			ppt.get(index).mostrarpote();
		}
	}

	public static void main(String[] args) {
		
		int opcion;
		Scanner sc=new Scanner(System.in);

		ArrayList<Pintxo> listadopintxos=new ArrayList<Pintxo>();
		ArrayList<Pote> listadopotes=new ArrayList<Pote>();
		ArrayList<Bar> listadobares=new ArrayList<Bar>();
		ArrayList<Cliente> listadoclientes=new ArrayList<Cliente>();

		
		
		
		System.out.println("================================================================");
		System.out.println("		1. Leer listado de pintxos"); 
		System.out.println("		2. Leer listado de potes");
		System.out.println(" 		3. Leer listado de bares");	
		System.out.println("		4. Crear Clientes");
		System.out.println("		5. Consumir PintxoPote");
		System.out.println("		6. Salir");	
		System.out.println("================================================================");
		System.out.println();
		System.out.print("Por favor, marque una de las siguientes opciones: ");
		
		
		do {
			opcion=sc.nextInt();
			
			switch (opcion) {

				case 1:

					try{
							String lecturapintxos;
							String[] atributospintxo;
							String[] listaingredientespintxo;

							listadopintxos.clear();

							File f=new File("Pintxos.txt");
							FileReader fr=new FileReader(f);
							BufferedReader brr=new BufferedReader(fr);

						lecturapintxos=brr.readLine();
						while(lecturapintxos!=null) {
								Pintxo pin=new Pintxo();

								atributospintxo=lecturapintxos.split("; ");

								pin.setId(Integer.parseInt(atributospintxo[0]));
								pin.setNombre(atributospintxo[1]);

								listaingredientespintxo=atributospintxo[2].split(", ");
								pin.setIngredientes(listaingredientespintxo);
								
								pin.setTipo(Integer.parseInt(atributospintxo[3]));
								listadopintxos.add(pin);

								lecturapintxos=brr.readLine();

						}
						//Para comprobar que se ha cargado bien el arraylist de pintxo, visualizamos por pantalla con: 
						mostrarlistados(listadopintxos);
					}

					catch (Exception e) {
								System.out.println("Ha habido un error Io:  "+e.getMessage());
					}

					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
				break;

				case 2:
					
					try {
							String lecturapotes;
							String[] atributospote;


							File f=new File("Potes.txt");
							FileReader fr=new FileReader(f);
							BufferedReader brr=new BufferedReader(fr);
						listadopotes.clear();

						lecturapotes=brr.readLine();
						while (lecturapotes!=null) {
							Pote pt=new Pote();

							atributospote=lecturapotes.split("; ");
							
							pt.setId(Integer.parseInt(atributospote[0]));
							pt.setNombre(atributospote[1]);
							pt.setTipo(Integer.parseInt(atributospote[2]));
							listadopotes.add(pt);

							lecturapotes=brr.readLine();
						}
						mostrarlistadopotes(listadopotes);

					}
					catch (Exception e) {
								System.out.println("Ha habido un error Io:  "+e.getMessage());
					}


					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					break;

				case 3:
					String lecturabares;
					Bar br=new Bar();

					


					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					break;

				case 4:

					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					break;

				case 5:

					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					break;

				case 6:
					System.out.println("Ha finalizado el programa. Muchas gracias!");
					break;

				default:
					System.out.println("Esa opción no existe.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
				
			}
						
			System.out.println();

		}
		while (opcion!=6);



	}

}





