/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_juliocarcamo;
import java.util.Scanner;

/**
 *
 * @author jucec
 */
public class Lab2P1_JulioCarcamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
    int respuesta = 3;
    
    while (respuesta != 5){
    System.out.println("1. Clasificando numeros");
            System.out.println("2. Aproximado");
            System.out.println("3. MCD");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();
            
    switch (opcion) {
        case 1:
            System.out.print("Ingrese un número entero positivo: ");
        int numero = leer.nextInt();

        boolean esPar = false;
        if (numero % 2 == 0) {
            esPar = true;
        }

        boolean esPrimo = true;
        if (numero <= 1) {
            esPrimo = false;
        } else {
            int par = 2;
            while (par <= numero / 2) {
                if (numero % par == 0) {
                    esPrimo = false;
                    break;
                }
                par++;
            }
        }

        if (esPar) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }

        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
            }
            System.out.println("4. Volver a intentar?");
    
            break;
            
        case 2:
            
            System.out.println("Ingrese la precision del calculo");
            double limite = leer.nextInt();
            double contador=1;
            double acumular=1;
            double dividendo = 1;
         while(contador<=limite){
                 
                 double i = Math.pow(contador, 2);
                 dividendo = ((4*i)/(4*i-1));
                 acumular *= dividendo;
                 contador++;
 
                         }
        
                         System.out.println(acumular*2);
                        
                break;
            
            
            case 3:
                
                System.out.println("ingrese A");
                int number1 = leer.nextInt();
                System.out.println("ingrese B");
                int number2 = leer.nextInt();
                
                while (number1!=number2){
                if(number1>number2){
                number1 = number1 - number2;
                }else{
                number2= number2 - number1;
    }
    System.out.println("El MCD de" +number1+ "y" +number2+ "es"+number1);
    }
    }
    
             break;       
            }
    }
}
            
    
        
        // TODO code application logic here



    
