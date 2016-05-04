package cap5;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        int num,x,div;
        long fact=1;
        
        Scanner intro=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num=intro.nextInt();
        System.out.println("      ");
    
        div=0;
        for (x=2;x<num;x++){
            if (num%x==0){
                div++;
            }
        }
        if (div==0){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
        System.out.println("        ");
       

        for (x=1;x<=num;x++){
            System.out.println(fact+"*"+x);
            fact=fact*x;
        }
        System.out.println("Su factorial es "+fact);
        System.out.println("     ");
        
        System.out.println("Tabla del "+num);
        for(int i=1; i<=10; i++){
             System.out.println(num + " * " + i + " = " + num*i);
        }

    }
    
}
