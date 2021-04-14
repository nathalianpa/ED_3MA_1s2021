/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Desempenho;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetor;
import static Aula_02_Vetores.Ex_05_Intercalacao.bubbleSort;

/**
 *
 * @author anacris
 */
public class Ex_04_Inter2VetoresOrdenados {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v1[] = leVetor(n);
        bubbleSort(v1);
        exibeVetor(v1);
        
        int v2[] = leVetor(n);
        bubbleSort(v2);
        exibeVetor(v2);
        
        exibeInter2VetoresOrd(v1, v2);
 
    }
    public static void exibeInter2VetoresOrd(int v1[], int v2[]){
        int i = 0;
        int j = 0;
        
        while (i<v1.length && j<v2.length){
            if (v1[i] == v2[j]){
                System.out.print(v1[i] + " ");
                i++;
                j++;
            }
            else {
                if(v1[i] < v2[j])
                    i++;
                else 
                    j++;
            }
        }
    }
}
