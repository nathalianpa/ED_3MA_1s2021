/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;
import static Aula_06_Recursão.ADO2_Ex_03_SomaVetor.somaVetorR;

/**
 *
 * @author anacris
 */
public class ADO2_Ex_4_MediaVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetor(n);
        exibeVetor(v);
        System.out.println("\nA media dos elementos do vetor = " + mediaVetorR(v));
    }
    
    //Tem erro
     public static double mediaVetorR(int[] v) {
         return mediaVetorR(v,v.length-1);
     }
    
    public static double mediaVetorR(int[] v, int i) {
        if(i == 1)
            return v[0];
        
        return (v[i] + somaVetorR(v, i-1))/(double)v.length;

    }
    /*

    public static double mediaVetorR(int[] v) {
         return mediaVetorR(v,0);
     }
    
    public static double mediaVetorR(int[] v, int i) {
        if(i == v.length-1)
            return v[i];
        
        return (v[i] + somaVetorR(v, i+1))/(double)v.length;

    }
*/
}
