import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int dato;

        System.out.println("Escribe el año");
        dato=sc.nextInt();
        
        if(((dato % 4 ==0) && (dato % 100 != 0 )|| dato % 400 ==0)){
            System.out.println("Es un año bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto");
        }

    }
}