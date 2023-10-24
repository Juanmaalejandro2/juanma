import java.util.Scanner;


public class acumulador1 {
    
    public static void main(String[] args){
        
        // programa que desarrolla el factorial de un numero

   int suma=0, contador=0, numero=1000;
   Scanner sc = new Scanner(System.in);
   

        while(numero!=0){

            System.out.println("introduce un numero");

            numero= sc.nextInt();
            suma= suma+numero;
            contador= contador +1;

             

        }

        System.out.println("el total de la suma es "+ suma +" y la media es "+suma/contador);

    }







}
