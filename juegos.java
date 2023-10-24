import java.util.Random;
import java.util.Scanner;


public class juegos {
    
    public static void main(String[] args){
        
        int numero=0, numeroIntentos;
        int dado=0, humerus=0,cubitus=0;
        int numero1=0, numero2_1=0,numero2_2=0,numero2_3=0,numero2_4=0;
        


        System.out.println("introduce un numero de tiradas" );
        Scanner numeroTirada= new Scanner(System.in);


      
        numero= Integer.parseInt (numeroTirada.nextLine());

        for (int i=1;i<=numero;i++){

            while (dado < numero){
                numero1= generarTirada (numero);
                numero2_1= generarTirada (numero);
                numero2_2= generarTirada (numero);
                numero2_3= generarTirada (numero);
                numero2_4= generarTirada (numero);

                System.out.println("la tirada de humerus es " + numero1 + " la tirada de cubitus es " + numero2_1+ ", "+numero2_2+", "+numero2_3+" y "+numero2_4);
              
                dado++;  

                if (numero1 != numero2_1 && numero1 != numero2_2 && numero1 != numero2_3 &&  numero1 != numero2_1 ){

                    humerus++;


                    
                } else{
                    cubitus++;
                }
               


                
            }
                
        }
        
            System.out.println("el valor de humerus es de " + humerus);
            System.out.println("el valor de cubitus es de " + cubitus);
    }
   
    public static  int generarTirada (int numero1){
        Random rnd= new Random();
        int tirada = (int) (Math.random() * (6 - 1) + 1);
        //System.out.println((tirada));
        return tirada;

        

    }
}
