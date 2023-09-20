import java.util.Scanner;
public class VariablesAb16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,aux;

        System.out.print("Escribe el primer número: ");
        a= sc.nextInt();
        System.out.print("Escribe el segundo número: ");
        b= sc.nextInt();
        System.out.println("Cambiamos el primer valor por el segundo");
        System.out.println("El primero "+a+" cambio por segundo " +b);
        System.out.println("Y el segundo "+b+" por el primero.. "+a);
        aux=a;
        a=b;
        b=a;
        System.out.println("Ahora a es: "+a+" y ahora b es: " +b);
    
    }
}
