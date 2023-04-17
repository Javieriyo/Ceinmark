package SemanaSanta;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		int repeticion=1, opcion=0;
		Scanner ent =new Scanner(System.in);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ArrayList<Vehiculo>Listado=new ArrayList<Vehiculo>();
		ArrayList<Reservas>Reservados=new ArrayList<Reservas>();
		Vehiculo objVehiculo;
		Reservas objReservas;
		
		while (repeticion==1) {
			System.out.println(" ");
			System.out.println("Elige que opcion vas a utilizar");
			System.out.println("1: introducir un vehiculo nuevo");
			System.out.println("2: listar los vehiculos y su disponibilidad");
			System.out.println("3: buscar un vehiculo por su matricula");
			System.out.println("4: actualizar un vehiculo");
			System.out.println("5: eliminar un vehiculo");
			System.out.println("6: realizar una reserva");
			System.out.println("7: devolver un vehiculo");
			System.out.println("8: salir del programa");
			
			opcion=ent.nextInt();
			ent.nextLine();
			switch(opcion) {
			case 1:
				objVehiculo=new Vehiculo();
				System.out.println("matricula del vehiculo");
				objVehiculo.setmatricula(ent.nextLine());
				
				System.out.println("plaza del vehiculo (entre 1 y 9");
				int repe=0;
				while (repe==0) {
					int plaza=ent.nextInt();
					if (plaza>=1 && plaza<=9) {
						objVehiculo.setplaza(plaza);
						repe++;
						ent.nextLine();}
					else {
						System.out.println("plaza no valida");
						ent.nextLine();}
				}
				System.out.println("tipo de combustible (D, G, E, H)");
				objVehiculo.setcombustible(ent.nextLine());
				
				System.out.println("precio por dia del vehiculo");
				objVehiculo.setpreciodia(ent.nextDouble());
				ent.nextLine();
				Listado.add(objVehiculo);
				break;
				
				
			case 2:
				for (Vehiculo v:Listado) {
					System.out.println(v.toString());
					if (v.getreservado()==false) {
						System.out.println("sin reservar");}
					else {System.out.println("reservado");}
				}break;
				
				
			case 3:
				System.out.println("matricula del vehiculo");
				String matricula=ent.nextLine();
				for (Vehiculo v:Listado) {
					if(matricula==v.getmatricula()){
						System.out.println("el vehiculo existe");
						//no sabia que mostrar en este apartado asi que solo 
						//he puesto que me diga si exixte o no
					}else {System.out.println("el vehiculo no existe");}
				}break;
				
				
			case 4: 
				System.out.println("matricula del vehiculo a modificar");
				String matricula2=ent.nextLine();
				for (Vehiculo v:Listado) {
					if(matricula2==v.getmatricula()) {
						
						System.out.println("matricula del vehiculo");
						v.setmatricula(ent.nextLine());
						
						System.out.println("plaza del vehiculo (entre 1 y 9");
						int repe2=0;
						while (repe2==0) {
							int plaza=ent.nextInt();
							if (plaza>=1 && plaza<=9) {
								v.setplaza(plaza);
								repe2++;
								ent.nextLine();}
							else {
								System.out.println("plaza no valida");
								ent.nextLine();}
						}
						System.out.println("tipo de combustible (D, G, E, H)");
						v.setcombustible(ent.nextLine());
						
						System.out.println("precio por dia del vehiculo");
						v.setpreciodia(ent.nextDouble());
						ent.nextLine();
					}else {System.out.println("el vehiculo no existe");}
					break;
				}
				
				
			case 5:
				System.out.println("matricula del vehiculo a eliminar");
				String matricula3=ent.nextLine();
				for (Vehiculo v:Listado) {
					if(matricula3==v.getmatricula()) {
						Listado.remove(v);
						System.out.println("vehiculo eliminado");
					}else {System.out.println("vehiculo no encontrado");}
				}break;
			
			case 6:
				objReservas=new Reservas();
				System.out.println("DNI del usuario");
				objReservas.setdni(ent.nextLine());
				
				System.out.println("matricula del vehiculo a reservar");
				String matricula4=ent.nextLine();
				for(Vehiculo v:Listado) {
					if(matricula4==v.getmatricula() && v.getreservado()==false) {
						v.setreservado(true);}
					else if(matricula4==v.getmatricula() && v.getreservado()==true) {
						System.out.println("el vehiculo ya esta reservado");
						break;
					}else {System.out.println("el vehiculo no existe");
					break;}
						
					
				}
				
				
				try {
					System.out.println("fecha de inicio de la reserva");
					objReservas.setfinicio(LocalDate.parse(ent.nextLine(),df));
					System.out.println("hora de inicio de la reserva");
					objReservas.sethinicio(LocalTime.parse(ent.nextLine()));
					Reservados.add(objReservas);
					break;
				}
				catch(java.util.InputMismatchException ex) {
					System.out.println("error al introducir los datos");
				}catch(java.time.format.DateTimeParseException ex) {
					System.out.println("error al introducir los datos");
				}break;
		case 7:
			System.out.println("matricula del vehiculo a devolver");
			String matricula5=ent.nextLine();
			for(Reservas r:Reservados) {
				if(matricula5==r.getmatricula()) {
					for(Vehiculo v: Listado) {
						v.setreservado(false);
						
						long dias=ChronoUnit.DAYS.between(r.getfinicio(),LocalDate.now());
						double pago= dias*v.getpreciodia();
						
						System.out.println("el precio a pagar es de "+pago+" €");
					}
					
					
				}else {System.out.println("vehiculo no existente");
				break;}
			}
		
		case 8:
			repeticion++;
			System.out.println("cerrando programa");
			break;
			}
	}
}
}
