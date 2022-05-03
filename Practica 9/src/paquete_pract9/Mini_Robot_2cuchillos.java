package paquete_pract9;

public class Mini_Robot_2cuchillos extends Robot {

	private String nombre;
	
	public Mini_Robot_2cuchillos(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void mostNombre() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre);
	}

	@Override
	public void Bateria(int i) {
		// TODO Auto-generated method stub
		System.out.println("Bateria restante: "+(100-i));
	}

	@Override
	public void identificacion(int i) {
		// TODO Auto-generated method stub
		System.out.println("\n"+"Robot: "+i);
	}
	@Override
	public void ultAccion() {
		// TODO Auto-generated method stub
		System.out.println("Corte,corte,cotre!!");
		System.out.println("**"+this.nombre+" Corto la carne y las verduras**");
	}

}
