/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busquedas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_11_Busquedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner( System.in);
        int val;
        int califas[]= {0,1,2,3,4,5,6,7,8,9,10};
        for (int cali : califas) {
            System.out.println("las calificaciones son: "+ cali);
        }
        System.out.println("");
        System.out.println("Ingrece el valor a buscar");
        System.out.println("");
        val=sc.nextInt();
        //Buscar
        // recorrer el arreglo (ciclo for)
        // comparar el valor buscvado con el valor en el arreglo (IF)
        //Detenerme si lo encuentro, si no, seguir buscando 
        int posi=-1; // una posicion que no exciste
        for (int i = 0; i < califas.length; i++) {
            if(val==califas[i]){
                posi=i;//almaceno la posicion deonde esta el valor
                System.out.println("Posicion = "+ posi);
                break;
            }
            
        }
    }
    
}
