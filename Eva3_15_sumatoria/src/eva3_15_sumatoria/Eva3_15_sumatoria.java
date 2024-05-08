/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_15_sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("numero elegido");
        int suma=sc.nextInt();
        int resu=preSum(suma);
        // calcular la potencia
        
        System.out.println("los numeros previos son = ");
        System.out.print(resu);
    }
    //crear una funcion que calcule la potencia de un valor entero
    public static int preSum(int suma){
        //Necesitamos un acumulador
        System.out.println("los numeros previos son");
        int resu=0;
        for (int i = 1; i <= suma; i++) {
            
            resu = i+resu ;
            System.out.println(resu);
        }System.out.println("");
        return resu;
        
        
    }
    
}
