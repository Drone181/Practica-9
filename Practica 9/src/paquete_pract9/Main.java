package paquete_pract9;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int i,j;
		
		Boolean s = false;
		
		Mini_Robot_2cuchillos mr = new Mini_Robot_2cuchillos("Pablo");
		Mini_Robot_V mrV = new Mini_Robot_V("Pedro");
		Robot_S rs = new Robot_S("Patricio");
		Reloj.iniciarR1();
		
		do {
			do {
				System.out.println("\nIngrese una opcion:\n1.desayuno\n2.comida\n3.cena");
				i = tec.nextInt();
				//System.out.println("");
				System.out.println(((i>3||i<1) ? "Opcion no valida" : ""));
			}while(i>3||i<1);
			
			System.out.println("Los robots estan listos para empezar!!");
			
			Reloj.reiniciar();
			do {
				System.out.println("\nSeleccione una opcion:\n1.Preparar ingredientes\n2.Cocinar\n3.Servir");
				j = tec.nextInt();
				
				switch(j) {
				case 1:
					mr.identificacion(01);
					mr.mostNombre();
					mr.ultAccion();
					
					break;
				case 2:
					System.out.println("\nUpss!!!, Primero tengo que preparar los ingredientes para que se puedan cocinar");
					break;
				case 3:
					System.out.println("\nUpss!!!, Aun no esta listo, mas despacio");
					break;
				default:
					System.out.println("Opcion no valida, intentalo de nuevo");
					break;
				}
			}while(j!=1);
			mr.Bateria(Reloj.imprimir());
			Reloj.reiniciar();
			
			do {
				
				System.out.println("\nSeleccione una opcion:\n1.Preparar ingredientes\n2.Cocinar\n3.Servir");
				j = tec.nextInt();
				
				switch(j) {
				case 1:
					System.out.println("\nUpss!!!, No puede repetir una accion anterior");
					break;
				case 2:
					mrV.identificacion(02);
					mrV.mostNombre();
					mrV.version(i);
					mrV.ultAccion();
					break;
				case 3:
					System.out.println("\nUpss!!!, Me temo que eso no es posible por el momento ni para mi");
					break;
				default:
					System.out.println("Opcion no valida, intentalo de nuevo");
					break;
				}
				
			}while(j!=2);
			mrV.Bateria(Reloj.imprimir());
			Reloj.reiniciar();
			
			do {
				
				System.out.println("\nSeleccione una opcion:\n1.Preparar ingredientes\n2.Cocinar\n3.Servir");
				j = tec.nextInt();
				
				switch(j) {
				case 1:
					System.out.println("\nUpss!!!, Ese paso ya fue hecho anteriormente");
					break;
				case 2:
					System.out.println("\nUpss!!!, La comida ya esta lista, pero aun falta servirla");
					break;
				case 3:
					rs.identificacion(3);
					rs.mostNombre();
					rs.ultAccion();
					break;
				default:
					System.out.println("Opcion no valida, intentalo de nuevo");
					break;
				}
				
			}while(j!=3);
			rs.Bateria(Reloj.imprimir());
			Reloj.reiniciar();
			
			System.out.println("\n------TAREA COMPLETADA------\n");
			System.out.println("¡Hurra! El plato estaba delicioso");
			
			System.out.println("\nDeseas preparar otro platillo ? \n1.Si\n2.No");
			i = tec.nextInt();
			s = (i==1)? false:true;
			
		}while(s==false);
		
		Reloj.detener();
		
		System.out.println("\nADIOS!!!");
		System.exit(1);
		
	}
	
}
