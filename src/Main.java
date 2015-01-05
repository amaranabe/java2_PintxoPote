import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReadear;
import java.io.BufferReadear;


class Main {

	/*public static mostrarlistados (ArrayList<Pintxos> pp) {
		int index;
		for (index=0; index<pp.size(); index++ ) {
			System.out.println("");
		}
	}*/

	public static void main(String[] args) {
		
		int opcion;
		Scanner sc=new Scanner(System.in);
		File f=new File();
		FileReadear fr=new FileReadear();
		BufferReadear brr=new BufferReadear();

		
		
		
		System.out.println("================================================================");
		System.out.println("		1. Cargar Pintxos (desde fichero Pintxos.txt)"); 
		System.out.println("		2. Cargar Potes (desde fichero Potes.txt)");
		System.out.println(" 		3. Cargar Bares (desde fichero Bares.txt)");	
		System.out.println("		4. Asignar pintxos y potes a cada bar manualmente");
		System.out.println("		5. PintxoPote");
		System.out.println("		6. Salir");	
		System.out.println("================================================================");
		System.out.println();
		System.out.print("Por favor, marque una de las siguientes opciones: ");
		opcion=nextInt();
		
		do {

			switch (opcion) {

				case 1:

					try{
							String lecturapintxos;
							String[] atributospintxo;
							Pintxos pin=new Pintxos();
							ArrayList<Pintxos> listadopintxos=new ArrayList<Pintxos>();

							File f=new File("Pintxos.txt");
							FileReadear fr=new FileReadear("f");
							BufferReadear brr=new BufferReadear("fr");

						lecturapintxos=brr.readLine();
						while(lecturapintxos!=null) {
								atributospintxo=lecturapintxos.split("; ");

								pin.setId(Integer.parseInt.atributospintxo[0]);
								pin.setNombre(atributospintxo[1]);
								pin.setIngredientes(atributospintxo[2]);
								pin.setTipo(Integer.parseInt.atributospintxo[3]);
								listadopintxos.add(pin);

								lecturapintxos=brr.readLine();

						}
					}

					catch (Exception e) {
								System.out.println("Ha habido un error Io:  "+e.getMessage());
					}

					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					opcion=nextInt();
					break;

				case 2:
					
					try {
							String lecturapotes;
							String[] atributospote;
							Potes pt=new Potes();
							ArrayList<Pote> listadopotes=new ArrayList<Pote>();

							File f=new File("Potes.txt");
							FileReadear fr=new FileReadear("f");
							BufferReadear brr=new BufferReadear("fr");

						lecturapotes=brr.readLine();
						while (lecturapotes!=null) {
							atributospote=lecturapotes.split("; ");
							
							pt.setId(Double.parseDouble.atributospote[0]);
							pt.setNombre(atributospote[1]);
							pt.setTipo(Double.parseDouble.atributospote[2]);
							listadopotes.add(pt);

							lecturapotes=brr.readLine();
						}


					}
					catch (Exception e) {
								System.out.println("Ha habido un error Io:  "+e.getMessage());
					}


					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					opcion=nextInt();
					break;

				case 3:
					String lecturabares;
					Bar br=new Bar();



					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					opcion=nextInt();
					break;

				case 4:

					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					opcion=nextInt();
					break;

				case 5:

					System.out.println("Proceso realizado.");
					System.out.print("Por favor, marque la nueva opción que desee: ");
					opcion=nextInt();
					break;

				case 6:
					System.out.println("Ha finalizado el programa. Muchas gracias!");
					break;

				default:
					System.out.println("Esa opción no existe.");
				
			}
			if(opcion!=6) {
				System.out.print("Esta opción no existe. Vuelve a elegir otra opción: ");
			}
			
			System.out.println();

		}
		while (opcion!=6);



	}

}





