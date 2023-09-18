import java.util.Scanner;

public class farmacia13 {
    public static void main(String[] args) {
        float prod,precio;
        Scanner sc= new Scanner(System.in);

        System.out.print("Escriba el precio del producto: ");
        prod=sc.nextFloat();
        System.out.println("El precio con el 10% es: ");
        precio=(prod*10)/100;
        System.out.print((prod-precio)+"€");
        //(Candidad × 10) ÷ 100 = Descuento
        // Candidad - Descuento = Precio Final.

    }
}
