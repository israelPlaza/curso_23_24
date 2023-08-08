import java.util.Scanner;

public class ParInpar {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Escribe un numero para saber si es par o impar: ");
      int num=sc.nextInt();

      if(num % 2==0){
        System.out.println("El numero es par");
      }else{
        System.out.println("El número es impar");
      }

    }
}
