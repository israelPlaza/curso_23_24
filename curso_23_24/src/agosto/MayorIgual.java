import java.util.Scanner;

public class MayorIgual {
    public static void main(String[] args) {

        int num1 =0;
        int num2 =0;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("EScribe el primer número: ");
        int num1=entrada.nextInt();

        System.out.println("EScribe el segundo número: ");
        int num2=entrada.nextInt();
    
        if(num1>num2){
            System.out.println(num1 + " es mayor que: "+ num2);
        }else if(num1<num2){
            System.out.println(num1 + " es menor que: "+ num2);
        } else if(num1==num2){
            System.out.println(num1 + " es igual a " + num2);
        }
    
    
    
    }
    
}
