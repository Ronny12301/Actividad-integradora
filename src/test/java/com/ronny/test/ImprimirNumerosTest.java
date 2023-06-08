/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.ronny.test;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ronny.main.ImprimirNumeros;

/**
 *
 * @author ronny12301
 */
public class ImprimirNumerosTest {
    
    @Test
    public void obtenerNumeros() {
        int numero1 = 4;
        int numero2 = 10;
        
        int[] valorEsperado = {5,6,7,8,9};
        
        int[] valorActual = ImprimirNumeros.numerosIntermediarios(numero1, numero2);
        
        assertArrayEquals(valorEsperado, valorActual);
    }

}
