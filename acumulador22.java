import java.util.Scanner;


public class acumulador22 {
    
    public static void main(String[] args){
        
        int numero=0;

        System.out.println("introduce un numero" );
        Scanner sc = new Scanner(System.in);
        numero= sc.nextInt();

        System.out.println("la tabla del " + numero + " es ");


        for (int i=1; i<= 10; i++){

           

            System.out.println((i * numero));




        }
   

        

        System.out.println("");

    }
}
