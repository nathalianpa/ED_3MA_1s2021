/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_02_ConvBinario2Decimal {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        System.out.printf("(%d) (2) = %d (10)\n", n, bin2DecR(n));
    }
    
    public static int bin2Dec(int binario){
        int decimal = 0;
        int cont = 0;
        
        while (binario > 0){
            int resto = binario %10;
            decimal += resto*Math.pow(2, cont);
            binario = binario/10; //atualização
            cont++; //atualização
        }
        return decimal;      
    }
    public static int bin2DecR(int binario){
        if(binario < 1)
            return binario;
     
        return binario%10 + 2*bin2DecR(binario/10);      
    }
}
