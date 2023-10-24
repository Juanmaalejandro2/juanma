import java.util.Scanner;


public class exception {
    
    public static void main(String[] args){

        int numero=0;
       

        while(numero !=3){

            System.out.println("1 saludo anonimo");
            System.out.println("2 saludo con tu nombre");
            System.out.println("3 salir");
            
            

            Scanner sc = new Scanner(System.in);
            numero= Integer.parseInt(sc.nextLine());

            switch (numero){
                case 1: System.out.println("buenas tardes");
                break;
                case 2: System.out.println("buenas tardes veronica");
                break;
                case 3: System.out.println("adios, buenos dias");
               
            }



        }


        
        

        
    }
        

}
