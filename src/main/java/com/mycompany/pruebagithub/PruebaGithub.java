/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebagithub;

import static metodos_calculadora.Metodos.*;

/**
 *
 * @author Sebastian
 */
public class PruebaGithub {

    public static void main(String[] args) {
        saludar();
        System.out.println("Suma 1 y 2: " + suma(1,2));
        System.out.println("Resta 1 y 2: "+resta(1, 2));
        System.out.println("Multiplica 2 y 2: "+multiplicacion(2, 2));
        try{
            System.out.println("Divide 2 y 1: "+division(2, 1));
        }catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Programa finalizado");
        
        
    }
}
