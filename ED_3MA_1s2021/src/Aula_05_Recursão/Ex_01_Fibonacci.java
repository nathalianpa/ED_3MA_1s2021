/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_01_Fibonacci {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        System.out.printf("Fibonacci(%d) = %d\n", n, fib(n));
    }
    
    public static int fib(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        
        return fib(n-1) + fib(n-2);
    }
}
