package ParteA;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		
		System.out.println("1 para ver las casas habitaciones disponibles");
		System.out.println("2 para reservar una habitacion");
		System.out.println("3 para devolver la habitacion");
		System.out.println("4 para salir");
		Scanner ent = new Scanner (System.in);
		int opcion;
		opcion = ent.nextInt();
		
		ArrayList<Habitación> habitaciones=new ArrayList();
		
		habitaciones.add(new Habitación (1,1,true,false,30.0f,false));
		habitaciones.add(new Habitación (2,1,true,false,30.0f,false));
		habitaciones.add(new Habitación (3,1,false,true,40.0f,false));
		habitaciones.add(new Habitación (4,2,true,false,20.0f,false));
		habitaciones.add(new Habitación (5,2,true,false,20.0f,false));
		habitaciones.add(new Habitación (6,2,false,true,25.0f,false));
		
		
		switch(opcion) {
			case (1):
				System.out.println("listado de todas las habitaciones");
				for (int i=0; i<habitaciones.size(); i++) {
					System.out.println(habitaciones.get(i).toString());}
				break;
			case(2):
				System.out.println("id de la habitacion en la que te has quedado");
				int idhab=ent.nextInt();
				boolean check=false;
				for (Habitación h: habitaciones) {
					if (h.getnumero()==idhab) {
						h.pagar(h.getprecio());
						h.setalquilada(false);
						check=true;	
					}
				}
				
				if (!check) {
					System.out.println("no se ha encontrado la habitacion");
				}
					break;
			case(3):
				System.out.println("id de la habitacion que quieres alquilar");
				int iddevolver=ent.nextInt();
				boolean check2=false;
				for (int i=0; i<habitaciones.size();i++) {
					if(habitaciones.get(i).getnumero()==iddevolver) {
						if (Habitación.getalquilada()==true) {
							System.out.println("habitación ocupada");
							check2=true;}
						else {
							Habitación.setalquilada(true);
							System.out.println("alquilada con exito");
							check2=true;}
					}
					if (!check2) {
						System.out.println("la habitacion no existe");
					}
				}
				break;
			case(4):
				System.out.println("saliendo del programa");
			break;
		}
		
		

	}

}
