/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_5d;

/**
 *
 * @author Usuario
 */
public class Eva3_8_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nabo [][][][][] = new int [10][5][3][2][5];
        for (int i = 0; i < nabo.length; i++) {
            for (int j = 0; j < nabo[i].length; j++) {
                for (int k = 0; k < nabo[i][j].length; k++) {
                    for (int l = 0; l < nabo[i][j][k].length; l++) {
                        for (int m = 0; m < nabo[i][j][k][l].length; m++) {
                           nabo [i][j][k][l][m] = (int)(Math.random()*100);
                    System.out.println("matriz["+i+"]["+j+"]["+k+"]["+l+"]["+m+"] = "+ nabo[i][j][k][l][m]); 
                        }
                    }
                }
                

            }
        }
    }
}
    

