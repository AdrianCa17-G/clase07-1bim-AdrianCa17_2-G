/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto01;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author USER
 */
public class Proyecto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        String mensajeFinal = "";
        String nombre;
        int dias;
        double costoDia;
        double valorCancelar;
        int contador;
        
        contador = 1;
 

        while (contador <= 5) {
            
            System.out.println("Ingrese nombre de empleado: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese dias trabajados: ");
            dias = entrada.nextInt();

            System.out.println("Ingrese valor de costo dia: ");
            costoDia = entrada.nextDouble(); 
            entrada.nextLine();
            
            valorCancelar = dias * costoDia;

            mensajeFinal = String.format( 
                "%sNombre %s: dias %d, costo por dia $ %.1f, total $ %.0f\n", 
                mensajeFinal, nombre, dias, costoDia, valorCancelar);
            
            contador = contador + 1;
        }
        
        System.out.println(mensajeFinal);
  
    }
    
}