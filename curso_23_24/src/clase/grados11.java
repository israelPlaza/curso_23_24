import java.util.Scanner;

public class grados11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float grados;

        System.out.print("Escribe su temperatura en grados: ");
        grados=sc.nextFloat();
        System.out.println("Su temperatura en Fahrentheit: "+((grados*1.8) +32)+" F");

    }
}
