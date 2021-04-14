/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_05_Recursão.Ex_02_Produto.produto;

/**
 *
 * @author anacris
 */
public class Ex_03_Potencia {
    public static void main(String[] args) {
        System.out.println("Digite um número base: ");
        int base = leInteiroPositivo();
        System.out.println("Digite um número exp: ");
        int exp = leInteiroPositivo();
        
        System.out.printf("Potencia(%d,%d) = %d\n",base,exp,potencia(base,exp));
    }
    public static int potencia(int a, int n){
        if(n == 1)
            return a;
        
        return a * potencia(a, n-1);
    }
}
