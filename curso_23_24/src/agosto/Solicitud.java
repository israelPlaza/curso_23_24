import java.util.Scanner;

public class Solicitud{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Escribe el número de la nota: ");
        int nota=sc.nextInt();
        System.out.println("Escribe la edad: ");
        int edad=sc.nextInt();

            if(nota==5 &&edad<18){
                System.out.println("Solicitud posible");
            }
            else if(nota>5 &&edad>18){
                System.out.println("Solicitud ACEPTADA");
            }
            else if(nota<5 && edad<18){
                System.out.println("Solicitud NO ACEPTADA");
            }    
    }
}