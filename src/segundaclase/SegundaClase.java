/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaclase;

import java.util.Scanner;

/**
 *
 * @author vassa
 */
public class SegundaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Operadores Logicos
        /*
        Not -> ! true = false
        And -> true && false
        Or -> true || false 
         */

        int a = 3;
        int b = 2;
        int c = 3;

        //System.out.println(a == c && a > b);
        //System.out.println(a < b || b == c);   
        //Operadores de Incremento Decremento (VER EJ FOR)
        //System.out.println(a);
        //Entrada de Datos
        //Intanciar clase o crear objeto
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = leer.nextLine();
        System.out.println("-----------");
        System.out.println("Usted se llama: "+ nombre);
         */
 /*
        Scanner leerUno = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int numeroUno = leerUno.nextInt();
        Scanner leerDos = new Scanner(System.in);
        System.out.println("Ingrese segundo numero: ");
        int numeroDos = leerDos.nextInt();
        System.out.println("Estos el primer num: "+ numeroUno);
        System.out.println("Estos el segundo num: "+ numeroDos);
         */
 /*
        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = obj.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = obj.nextInt();

        int suma = num + num2;

        System.out.print("la suma de los dos numeros es: " + suma);
         */
        //CONDICIONALES
        //Creo un objeto de la clase Scanner
        /*
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int personaX = leer.nextInt();
       
        if (personaX >= 18) {
            System.out.println("es mayor de edad");
        }
        else{
            System.out.println("es menor de edad");
        }
         */
        //Condicionales Anidadas
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();

        //Pares e impares
        if (n != 0) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println("El número es PAR POSITIVO");
                } else {
                    System.out.println("El número es IMPAR POSITIVO");
                }
            } else {
                if (n < 0) {
                    if (n % 2 == 0) {
                        System.out.println("El número es PAR NEGATIVO");
                    } else {
                        System.out.println("El número es IMPAR NEGATIVO");
                    }
                }
            }
        } else {
            System.out.println("Es CERO");
        }

    }
}