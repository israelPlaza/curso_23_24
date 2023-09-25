import java.util.Scanner;

public class Alumnas15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float nos,nas, total, por;
        
        System.out.print("Escriba el número de alumnos de tú clase");
        nos= sc.nextFloat();
        System.out.print("Escriba el número de alumnas de tú clase");
        nas= sc.nextFloat();
        total= nos+nas;
        por=nos/total*100;
        System.out.println("Porcentaje de alumnos: " + por + " %");

        por=nas/total*100;
        System.out.println("Porcentaje de alumnas: " + por + " %");
        
        sc.close();
    }
}
