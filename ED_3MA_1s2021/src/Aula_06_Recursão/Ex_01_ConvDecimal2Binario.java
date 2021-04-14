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
public class Ex_01_ConvDecimal2Binario {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        System.out.printf("(%d) (10) = %d (2)\n", n, dec2BinR(n));
    }
    
    public static int dec2Bin(int decimal){
        int binario = 0;
        int cont = 0;
        
        while (decimal > 0){
            int resto = decimal %2;
            binario += resto*Math.pow(10, cont);
            decimal = decimal/2; //atualização
            cont++; //atualização
        }
        return binario;      
    }
    public static int dec2BinR(int decimal){
        if(decimal < 2)
            return decimal;
     
        return decimal%2 + 10*dec2BinR(decimal/2);      
    }
}
