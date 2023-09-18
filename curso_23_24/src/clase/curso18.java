import java.util.Scanner;
public class curso18 {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        float primero,segundo,tercero;

        System.out.print("Ecriba la nota del primer trimestre: ");
        primero= sc.nextFloat();
        System.out.print("Ecriba la nota del segundo trimestre: ");
        segundo= sc.nextFloat();
        System.out.print("Escriba la nota del tercer trimestre: ");
        tercero= sc.nextFloat();

        float aux1=(primero*20)/100;
        System.out.println("Nota del primer parcial es: "+aux1);

        float aux2=(segundo*30)/100;
        System.out.println("Nota del segundo parcial es: "+aux2);

        float aux3=(tercero*50)/100;
        System.out.println("Nota del tercer parcial es: "+aux3);

        System.out.println();
        System.out.println("La nota final es: "+(aux1+aux2+aux3));

    }
}
