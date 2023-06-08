package com.ronny.main;

import java.util.Scanner;

/**
 *
 * @author ronny12301
 */
public class ImprimirNumeros {

    /**
     * Metodo para llenar el arreglo con los numeros
     * que estan dentro del rango de 2 numeros introducidos
     * 
     * @param numero1
     * @param numero2
     * @return lista de numeros
     */
    public static int[] numerosIntermediarios(int numero1, int numero2) {
        
        if (numero1 == numero2) {
            return null;
        }
        
        int numeroInicial;
        
        int umbral = Math.abs(numero1 - numero2);
        
        if (umbral > 1) {
            umbral--;
        }
        
        int[] lista = new int[umbral];
        
        
        if (numero1 < numero2) {
            numeroInicial = numero1;
        }
        else {
            numeroInicial = numero2;
        }
        
        for (int i = 0; i<umbral; i++ ) {
            numeroInicial++;
            lista[i] = numeroInicial;
        }
        
        return lista;    
    } 
    
    /**
     * Metodo para imprimir los numeros del arreglo
     * 
     * @param arr  arreglo numerico a imprimir
     */
    public static void imprimirArreglo(int[] arr) {
        
        if (arr == null) {
            return;
        }
        
        System.out.println("------------");
        
        for (int numero : arr) {
            System.out.println("Numero: " + numero);
        }
        
        System.out.println("------------");
    }
    
    
    /**
     * Metodo main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Indroduzca un numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduzca un segundo numero: ");
        int numero2 = scanner.nextInt();
        
        int[] numeros = numerosIntermediarios(numero1, numero2);
        
        imprimirArreglo(numeros);
    }
    
}
