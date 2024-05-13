/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_19_referencias;

/**
 *
 * @author Usuario
 */
public class Eva3_19_referencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [] arreglo = new int [5];
    int x= 100;
        System.out.println("Antes de llamar al metodo. x = "+ x);
        // es la que se manda a la otra clase
        // se manda una copia la cual no modifica la original
        sumarUno(x);
        //original no se modifica
        System.out.println("Despues de llamar al metodo. x = "+ x);
        System.out.println("---------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+ arreglo[i]+"]");
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("["+ arreglo[i]+"]");
        }
    }
    
   public static void sumarUno (int valor){
       // copia modificable 
       System.out.println("Antes de la operacion. valor: "+ valor);
       valor++;
       System.out.println("Despues de la operacion. Valor: "+ valor);
   } 
   //paso por referencia (afecta al original)
   public static void modificarArreglo(int[]arreglo){
       for (int i = 0; i < arreglo.length; i++) {
           arreglo[i]= ((int)(Math.random()*100));
       }
   }
}
