package paquete_pract9;

import java.util.Timer;
import java.util.TimerTask;

public class Reloj {
	public static int t = 0;
	public static Timer timer1  = new Timer();
	
	public static TimerTask tarea1 = new TimerTask() {
		@Override
		public void run() {
            t++;

        }
		
	};
	
	public static void iniciarR1() {
		timer1.scheduleAtFixedRate(tarea1, 0, 1000);
	}
	
	public static int imprimir() {
		return t;
	}
	
	public static void reiniciar() {
		t=0;
	}
	
	public static void detener() {
		tarea1.cancel();
		timer1.cancel();
	}
	
}
