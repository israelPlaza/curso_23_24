import java.util.Scanner;

public class SumaReales10 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        float num1,num2;

        System.out.println("Escribe el primer número: ");
        num1 =sc.nextFloat();
        System.out.println("Escribe el segundo número: ");
        num2 =sc.nextFloat();
       System.out.println("La suma es: " +(num1+num2));
    }
}
