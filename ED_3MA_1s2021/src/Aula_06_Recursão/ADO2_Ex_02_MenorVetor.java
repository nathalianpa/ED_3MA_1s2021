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
public class ADO2_Ex_02_MenorVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("\nO menor elemento do vetor = " + menorVetorR(v));
    }
    
    /*
     public static int menorVetorR(int[] v) {
         return menorVetorR(v,v.length);
     }
    
    public static int menorVetorR(int[] v, int i) {
        if(i==1)
            return v[0];
        
        int x = menorVetorR(v,i-1);
        if(x < v[i-1])
            return x;
        else
            return v[i-1];

    }
*/
    
    public static int menorVetorR(int[] v) {
         return menorVetorR(v,0);
     }
    
    public static int menorVetorR(int[] v, int i) {
        if(i== v.length-1)
            return v[i];
        
        int x = menorVetorR(v,i+1);
        if(x < v[i])
            return x;
        else
            return v[i];

    }

    public static int menorVetor(int[] v) {
        int menor = v[0];
        
        for(int i=1; i <v.length;i++){
            if(v[i] < menor){
                menor = v[i];
            }   
        }
        return menor;
    }
}
