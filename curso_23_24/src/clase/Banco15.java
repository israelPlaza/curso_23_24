
import java.util.Scanner;
public class Banco15 {
    public static void main(String[] args) {
        float cantidad,interes;
        Scanner sc= new Scanner(System.in);

        System.out.print("Cantidad que tienes: ");
        cantidad=sc.nextFloat();
        System.out.println("El precio tras el interes es: ");
        interes=(cantidad*20)/100;
        System.out.print((cantidad-interes)+"€");
    }
}
