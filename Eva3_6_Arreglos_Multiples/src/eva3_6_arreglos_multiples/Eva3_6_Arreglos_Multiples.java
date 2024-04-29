/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_multiples;

/**
 *
 * @author Usuario
 */
public class Eva3_6_Arreglos_Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][]= new int [3][2];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[1][0] = 300;
        matriz[1][1] = 400;
        matriz[2][0] = 500;
        matriz[2][1] = 600;
        //-------------
        System.out.println("matriz.length = "+ matriz.length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz["+i+"]["+j+"] = "+ matriz[i][j]);
            }
        }
        
        
    }
    
}
