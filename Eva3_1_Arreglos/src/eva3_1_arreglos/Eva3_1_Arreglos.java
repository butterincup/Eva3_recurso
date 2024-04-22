/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author Usuario
 */
public class Eva3_1_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        - los arreglos en java son objetos.
        - tenemos que crearlos antes de usarlos
        - []--> manejar los indices: arreglo [3] acceso a la posicion
        - declaracion = creacion (new) [tamaño del arreglo]
        */
        int arreglo[] = new int [10]; // un arreglo de 10 enteros
        /*
        - a traves de indices:
        - conocer las posiciones de los valores:
        - Primer posicion de un arreglo es cero -->0
        - ultima posicion de un arreglo es --> N-1, donde
          n es el ultimo tamaño del arreglo
        */
        arreglo [1]=100;
        System.out.println("valor del arreglo [1] = " + arreglo[1]);
        System.out.println(arreglo); // lugar donde esta guardado el arreglo
        System.out.println(arreglo.length); // indica el espacio del arreglo
        
    }
    
}
