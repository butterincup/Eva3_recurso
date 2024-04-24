/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_propiedades_arreglos;

/**
 *
 * @author Usuario
 */
public class Eva3_5_Propiedades_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arreglo[]=new int[3];
        arreglo [0] = 100;
        arreglo [1] =200;
        arreglo [2] =300;
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i]+ "]");
        }
        //-----
        System.out.println("");
        System.out.println("Despued del cambio de tamaño");
        
        arreglo = new int [5];
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i]+ "]");
    }
        System.out.println("");
        
}
}