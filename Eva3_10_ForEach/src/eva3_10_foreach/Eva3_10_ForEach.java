/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_foreach;

/**
 *
 * @author Usuario
 */
public class Eva3_10_ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemanas[] = {"domingo", "lunes", "martes", "iercoles", "jueves", "viernes", "sabado" };
       // desventaja: no da las posiciones (si las nesesitas mejor for normal)
        for (String dia : diasSemanas) {
            System.out.println(dia);
        }
        
        int salario[]= {30, 3333, 2222,5555, 02, 34,212,};
        for (int i : salario) {
            System.out.println("$"+ i);
        }
        //--------
        //Meses
        String meses[]= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("los meses son: ");
        for (String mes : meses) {
            System.out.println("- " +mes);
        }
    }
    
}
