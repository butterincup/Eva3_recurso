/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperaturas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva3_18_temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //    En el main:
    //Mosrar un menu con las siguitentes opciones de convercion,
    Scanner sc=new Scanner(System.in);
        System.out.println("Elija el tipo de cambio de temperatura");
        System.out.println("1: celsius a fahrenheit");
        System.out.println("2: celsius a kelvin");
        System.out.println("3: fahrenheit a celsius");
        System.out.println("4: fahrenheit a kelvin");
        System.out.println("5: kelvin a fahrenheit");

        //el usiario debe elegir alguna, y lueho pedir la temperatura a comvertir
        
        int elección;
        elección=sc.nextInt();
        switch(elección){
            
            case 1:
                System.out.println("ingrce la temperatura en celsius ");
                double tCF=sc.nextInt();
                double aTem=CenFar(tCF);
                System.out.println("La temperatura en fahrenheit es: ");
                System.out.print(aTem);
                break;
            case 2:
                System.out.println("ingrece la temperatura en celsius ");
                double TCK=sc.nextInt();
                double btem=CenKel(TCK);
                
                System.out.println("La temperatura en kelvin es: ");
                System.out.println(btem);
                break;
            case 3:
                System.out.println("ingrece la temperatura en fahrenheit ");
                double TFC=sc.nextInt();
                double ctem=FarCen(TFC);
                
                System.out.println("La temperatura en celsius es: ");
                System.out.println(ctem);
                break;
            case 4:
                System.out.println("ingrece la temperatura en fahrenheit ");
                double TFK=sc.nextInt();
                double dtem=FarKel(TFK);
                
                System.out.println("La temperatura en kelvin es: ");
                System.out.println(dtem);
                break;
                
            case 5:
                System.out.println("ingrece la temperatura en kelvin ");
                double TKF=sc.nextInt();
                double etem=KelFar(TKF);
                
                System.out.println("La temperatura en fahrenheit es: ");
                System.out.println(etem);
                break;
                default:
                System.out.println("numero no valido");
        
        
        
    
    
    //Mostrar en consola (imprimir) el resultado de la comversion 
    
        }     
    }
    
    //Crear 5 metodos
    //convertir C-F
    public static double CenFar(double tCF){
      double aTem;
        aTem=((tCF * 1.8) +32);
     return aTem;   
    }
        //convertir C-K
    public static double CenKel(double TCK){  
        double btem;
        btem= TCK+ 273.15;
        return btem;
    }
   
    //convertir F-C
    public static double FarCen(double TFC){  
        double ctem;
        ctem=((TFC - 32) *(0.555555555));
        return ctem;
    }
    //convertir F-K
    public static double FarKel(double TFK){  
        double dtem;
        dtem=((TFK- 32)*0.555555555 + 273.15);
        return dtem;
    }
    //convertir k-F
    public static double KelFar(double TKF){  
        double etem;
        etem=((TKF - 273)*1.8 + 32);
        return etem;
    }
    
}
