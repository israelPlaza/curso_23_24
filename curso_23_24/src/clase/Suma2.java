
import java.util.Scanner;

public class Suma2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Escribe el primer número: ");
		num1= sc.nextInt();
		System.out.print("Escribe el segundo número: ");
		num2= sc.nextInt();
		System.out.println("La suma es: "+(num1+num2));
		
	}

}
