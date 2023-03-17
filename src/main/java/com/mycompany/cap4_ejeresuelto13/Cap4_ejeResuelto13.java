package com.mycompany.cap4_ejeresuelto13;
import java.util.Scanner;
public class Cap4_ejeResuelto13 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Scanner entratex = new Scanner(System.in);
        int valComp, valPag, pDes;
        String color;
        
        System.out.println("dame el valor de la compra");
        valComp = entrada.nextInt();
        
        System.out.println("dame el color");
        color = entratex.nextLine();
        
        if(color == "BLANCO"){
            pDes = 0;
        }else if(color == "VERDE"){
            pDes = 10;
        }else if(color == "AMARILLO"){
            pDes= 25;
        }else if(color == "AZUL"){
            pDes = 50;
        }else{
        pDes = 100;
        }
        valPag = valComp-(pDes*valComp/100);
        System.out.println("EL CLIENTE DEBE PAGAR: $"+ valPag);
    }
}
