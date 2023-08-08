import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la edad: ");
        int edad=entrada.nextInt();

        /* if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        } */


        if(edad<18){
            System.out.println("Eres adolescente");

        }
        else if (edad<25) {
            System.out.println("Eres joven");
        }
        else if(edad<65){
            System.out.println("Eres adulto");

        }
        else if(edad>65) {
            System.out.println("Cuidate");
        }

    }
}
