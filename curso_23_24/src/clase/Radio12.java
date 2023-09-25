import java.util.Scanner;

public class Radio12 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        float rad;
        final double PI = 3.14;

        System.out.print("Escriba el Radio del circulo: ");
        rad=sc.nextFloat();
        System.out.println("La longitud de la circufenricia es: "+ (2*PI*rad));
        System.out.println("El area del círculo es: "+ (PI*rad));
        sc.close();
    }
}
