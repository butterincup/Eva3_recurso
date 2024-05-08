/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_returner;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_13_Returner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Valor 1");
        int val1=sc.nextInt();
        System.out.println("Valor 2");
        int val2=sc.nextInt();
        //LLamar a la funcion
        
        //1. si vas a usar el resultado varias veses el resultado
        int resu= sumar(val1, val2);
        System.out.println("la suma es= "+ resu);
        //2. cuando solo se va a usar una vez el resultado 
        System.out.println("la suma es= "+ sumar(val1, val2));
        //3. ignorar el resultado
        sumar(val1, val2);
    }
    
    
    public static int sumar(int num1, int num2){
        int resu= num1 + num2;
        return resu;// concluye con la instruccion, no se puede instrucciones despues
        
    }
}
