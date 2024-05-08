/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_14_return_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("base 1");
        int base=sc.nextInt();
        System.out.println("potencia 2");
        int pot=sc.nextInt();
        // calcular la potencia
        int resu= calcularPot(base, pot);
        System.out.println("el resultade es = "+resu);
    }
    //crear una funcion que calcule la potencia de un valor entero
    public static int calcularPot(int base, int potencia){
        //Necesitamos un acumulador
        int resu=1;
        for (int i = 0; i < potencia; i++) {
            resu *= base;
            
        }
        return resu;
    }
}
