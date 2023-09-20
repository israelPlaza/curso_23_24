import java.util.Scanner;

public class Uvas {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float  cantidad;
        String tipo;
        int cat;

        System.out.print("Tipo de Uva (A ó B): ");
        tipo= sc.nextLine();
        System.out.print("Categoria de la uva (1 ó 2): ");
        cat= sc.nextInt();
        System.out.print("Kilos de uvas: ");
        cantidad= sc.nextInt();

        System.out.println(tipo+ " "+ cat+ " " +cantidad);

        if (tipo=="a" | cat==1) {
            System.out.println("Su uva tipo A de categiría 1 a un precio de 0.20 cts kilo es de:"+cantidad*0.20+" euros.");
        }else if(tipo =="a"& cat==2) {
            System.out.println("Su uva tipo A de categiría 2 a un precio de 0.30 cts kilo es de:"+cantidad*0.30+" euros.");
        }else if (tipo =="b" & cat==1) {
            System.out.println("Su uva tipo B de categiría 1 a un precio de 0.30 cts kilo es de:"+cantidad*0.30+" euros.");
        }else if (tipo =="b"& cat==2) {
            System.out.println("Su uva tipo B de categiría 2 a un precio de 0.50 cts kilo es de:"+cantidad*0.30+" euros.");
        }     
        

    }
}
