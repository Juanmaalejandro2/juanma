import java.util.Random;


public class calculadoraa {

    public static double calculadora(double num1, double num2, String oper){
        if(oper.equals("-")){
            
            return num1-num2;
        }
        else if (oper.equals("+")){
            
            return num1+num2;
        }
        else if (oper.equals(("*"))){
            return num1*num2;
        }
        else if (oper.equals(("/"))){
            return num1/num2;
        }
        else{
            return 0;
        }
        

    }
    
    public static void main(String[] args){

        Random rnd= new Random();
        double rnd1= (int) (Math.random() * (1000 - 1) + 1);
        System.out.println(("el numero uno es "+ rnd1));

        double rnd2= (int) (Math.random() * (1000 - 1) + 1);
        System.out.println(("el numero dos es "+ rnd2));
        
        
        System.out.println("el resultado de la resta es " + calculadora(rnd1,rnd2,"-"));

        System.out.println("el resultado de la suma es " + calculadora(rnd1,rnd2,"+"));

        System.out.println("el resultado de la multiplicacion es " + calculadora(rnd1,rnd2,"*"));

        System.out.println("el resultado de la division es " + calculadora(rnd1,rnd2,"/"));
    }
        

}
