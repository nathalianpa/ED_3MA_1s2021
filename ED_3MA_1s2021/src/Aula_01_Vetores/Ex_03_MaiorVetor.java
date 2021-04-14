/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_03_MaiorVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("\nO maior elemento do vetor = " + maiorVetor(v));
    }

    public static int maiorVetor(int[] v) {
        int maior = v[0];
        
        for(int i=1; i <v.length;i++){
            if(v[i] > maior){
                maior = v[i];
            }   
        }
        return maior;
    }
}
