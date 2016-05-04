package cap5;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        int x1,x2,y1,y2,p;
        
        Scanner intro=new Scanner(System.in);
        
        System.out.println("Coordenadas:");
        System.out.println("Ingrese x1");
        x1=intro.nextInt();
        System.out.println("Ingrese x2");
        x2=intro.nextInt();
        System.out.println("Ingrese y1");
        y1=intro.nextInt();
        System.out.println("Ingrese y2");
        y2=intro.nextInt();
        
        p=(x2-x1)/(y2-y1);
        System.out.println(p);
        System.out.println(p+"x+"+"y+"+(-y1+(p*-x1*-1)));

    }
    
}
