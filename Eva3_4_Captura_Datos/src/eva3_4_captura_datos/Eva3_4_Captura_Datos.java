/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_4_Captura_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captu= new Scanner (System.in);
        System.out.println("¿Cuantos nombres cas a capturar?");
        cant= captu.nextInt();
        String[] listaNombres = new String[cant];
        captu.nextLine();
        //Hay que preguntar cada nombre
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre #" + (i+1)+ ": ");
            listaNombres[i] = captu.nextLine();
            
        }
        System.out.println("Los nombres son");
        for (int i = 0; i < listaNombres.length; i++) {
            
            System.out.println(listaNombres[i]);
            
        
    }
    
}
}