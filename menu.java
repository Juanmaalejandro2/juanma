import java.util.Scanner;


public class menu {
    
    public static void main(String[] args){

        int numero=0;
       

        while(numero !=4){

            System.out.println("seleciona menu");
            System.out.println("1 añadir");
            System.out.println("2 eliminar");
            System.out.println("3 borrar todo");
            System.out.println("4 salir");

            Scanner sc = new Scanner(System.in);
            numero= sc.nextInt();

            switch (numero){
                case 1: System.out.println("añadiendo");
                break;
                case 2: System.out.println("borrando");
                break;
                case 3: System.out.println("limpiando todo");
                break;
                case 4: System.out.println("saliendo");
            }



        }


        
        

        
    }
        

}

