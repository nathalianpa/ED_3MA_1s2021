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
public class Ex_06_SomaDigitos {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        System.out.printf("SomaDigitos(%d) = %d\n", n, somaDigitos(n));
    }
    
    public static int somaDigitos(int n){
        if (n < 10)
            return n;
        
        return n%10 + somaDigitos(n/10);
         
    }
}
