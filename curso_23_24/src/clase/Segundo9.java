import java.util.Scanner;

public class Segundo9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int seg, min;
        float hor;
		
        System.out.print("Escriba sus segundos :");
        seg= sc.nextInt();
        System.out.println("Su tiempo es :");
        System.out.println(seg+" segundos");
        System.out.println((seg/60)+" minutos");
        min=seg/60;
        System.out.println((min/60)+" horas");
    }
}
