package paquete_pract9;

public class Mini_Robot_V extends Robot implements Version {

	private String nombre;
	private int ver;
	public Mini_Robot_V(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void version(int v) {
		// TODO Auto-generated method stub
		switch(v) {
		case 1: System.out.println("Listo para preparar el desayuno!!");
		this.ver = v;
			break;
		case 2: System.out.println("Listo para preparar la comida!!");
		this.ver = v;
			break;
		case 3: System.out.println("Listo para preparar la cena!!");
		this.ver = v;
			break;
		}
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
		switch(this.ver) {
		case 1: System.out.println("**"+this.nombre+" Cocino el desayuno**");
			break;
		case 2: System.out.println("**"+this.nombre+" Cocino la comida**");
			break;
		case 3: System.out.println("**"+this.nombre+" Cocino la cena**");
			break;
		}
		
	}

}
