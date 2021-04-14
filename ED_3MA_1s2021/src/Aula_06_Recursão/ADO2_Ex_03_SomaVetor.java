/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class ADO2_Ex_03_SomaVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("\nA soma dos elementos do vetor = " + somaVetorR(v));
    }
    /*
     public static int somaVetorR(int[] v) {
         return somaVetorR(v,v.length-1);
     }
    
    public static int somaVetorR(int[] v, int i) {
        if(i == 0)
            return v[0];
        
        return v[i] + somaVetorR(v, i-1);

    }
*/
    public static int somaVetorR(int[] v) {
         return somaVetorR(v,0);
     }
    
    public static int somaVetorR(int[] v, int i) {
        if(i == v.length-1)
            return v[i];
        
        return v[i] + somaVetorR(v, i+1);

    }
}
