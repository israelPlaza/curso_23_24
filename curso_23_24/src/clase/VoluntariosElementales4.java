package src;

import java.util.Scanner;

public class VoluntariosElementales4 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		float velocidad;
		
			System.out.print("Escribe la velociad en Km/h: ");
			velocidad = sc.nextFloat();
			System.out.println("");
			System.out.println("La velocidad es: "+(velocidad*0.2777)+" m/s");
			//formula es multiplicar la velocidad en km/h por 5/18
			
			sc.close();
			
	}
}
