package boletin2;

import java.util.Scanner;

public class Boletin2 {

  
    public static void main(String[] args) {
      //Entrada por teclado
        float base, altura;
        Scanner obx= new Scanner(System.in);
        base =obx.nextFloat();
        System.out.println("tecla de altura");
        altura =obx.nextFloat();
        System.out.println("area="+base*altura/2);
                
    }
    
}
