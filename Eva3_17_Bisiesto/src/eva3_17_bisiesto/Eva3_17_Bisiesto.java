/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_17_Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int año ;
        Scanner sc =new Scanner (System.in);
        System.out.println("ingrece el año");
        año=sc.nextInt();
        
        boolean resu=esBisiesto(año);
        if (true){
            System.out.println("es bisiesto");
        }
         else
            System.out.println("No es bisiesto");
   
                }
    public static boolean esBisiesto(int año){
        
        boolean resu;
        
        
        if(año % 100 != 0)
            if(año % 4 == 0)
                resu = true;
            else
                resu = false;
                else if (año % 400 == 0)
                resu = true;
            else
            resu = false;
return resu;
    }

}
