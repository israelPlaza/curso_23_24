import java.util.Scanner;

public class MayorIgual {
    public static void main(String[] args) {
     
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
