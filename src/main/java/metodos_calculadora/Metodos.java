/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_calculadora;

/**
 *
 * @author Sebastian
 */
public class Metodos{
    
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplicacion(int a, int b){
        return a*b;
    }
    public static int division(int a, int b) throws ArithmeticException{
        if(b!=0){
            return a/b;
        }else{
            throw new ArithmeticException("dividir por cero no es posible");
        }
    }
    
    
}
