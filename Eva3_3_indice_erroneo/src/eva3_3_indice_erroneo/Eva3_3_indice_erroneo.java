/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_indice_erroneo;

/**
 *
 * @author Usuario
 */
public class Eva3_3_indice_erroneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[]=new int[10];
        datos[10]=100;// error en tiempo de ejecucuion: el indice 10 no existe
        System.out.println("El valor en daos [10] " + datos[10]);
        
    }
    
}
