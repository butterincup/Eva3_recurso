/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos;

/**
 *
 * @author Usuario
 */
public class Eva3_9_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // si tienes valores cortos esto es mas rapido
        String diasSemanas[] = {"domingo", "lunes", "martes", "iercoles", "jueves", "viernes", "sabado" };
        char vocales[] = {'a', 'e', 'i', 'o', 'u' };
        System.out.println("tamoaño del arreglo diasSemana" + diasSemanas.length);
        
        for (int i = 0; i < diasSemanas.length; i++) {
            System.out.println(diasSemanas[i]);
        }
        System.out.println("tamoaño del arreglo vocales" + vocales.length);

        for (int i = 0; i < vocales.length; i++) {

            System.out.println(vocales[i]);
        }
        System.out.println("selecciona una opcion");
        String menu[] = {"archivo", "nueva factura", "modificar", "salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i+ " - "+ menu[i]);
        }
                
        
    }
    
}
