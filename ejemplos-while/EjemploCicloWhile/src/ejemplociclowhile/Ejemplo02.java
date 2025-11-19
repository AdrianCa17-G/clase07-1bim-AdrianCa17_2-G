/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); // 36
        while (contador <= limite){
            
            if (contador%2!=0) {
                System.out.printf("Contador %d\n", 
                    contador);
            }
            
            contador = contador + 1;
        }
        
    }
}
/*
    El programa pide al usuario ingresar un limite de numeros
    en el cual dentro de ese limite mostrara los numeros
    impares hasta llegar a ese limite, ejemplo, si el usuario
    ingresa 10 el programa presentara los numeros 1 3 5 7 9
    que son impares hasta que llegue al limite o cerca al
    limite de 10, el programa evalua mediante el residuo donde
    ve si el residuo es 1 entonces lo presenta en pantalla,
    si el residuo es 0 no lo presentara y pasara al siguiente 
    numero
*/