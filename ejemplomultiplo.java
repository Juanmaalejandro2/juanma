import java.util.Scanner;

public class ejemplomultiplo {
    public static void main(String[] args) {
       int numero;


        // introduce un numero entero
        System.out.println("introduce un numero entero");
    
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();


        //  compara el resto con 0
         if (numero%10 == 0){

        //  si el modulo es 0 imprime en pantalla
         System.out.println("el numero es multiplo de 10");

        } else {

        //  si el modulo es diferente de 0 imprime en pantalla
         System.out.println("el numero no es multiplo de 10");
      
        }

        //  compara el resto con 0
        if (numero%2 == 0){

        //  si el modulo es 0 imprime en pantalla
         System.out.println("el numero es par");

        } else {

        //  si el modulo es diferente de 0 imprime en pantalla
         System.out.println("el numero es impar");
      
        }

    } 
    
}
