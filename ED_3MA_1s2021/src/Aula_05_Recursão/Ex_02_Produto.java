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
public class Ex_02_Produto {
    public static void main(String[] args) {
        System.out.println("Digite um número a: ");
        int a = leInteiroPositivo();
        System.out.println("Digite um número b: ");
        int b = leInteiroPositivo();
        
        System.out.printf("O produto de %d * %d = %d\n",a,b,produto(a,b));
    }
    
    public static int produto(int a, int b){
        if(b == 1)
            return a;
        
        return a + produto(a,b-1);
    }
}
