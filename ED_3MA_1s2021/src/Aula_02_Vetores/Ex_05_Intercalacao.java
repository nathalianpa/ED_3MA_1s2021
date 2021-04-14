/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;


/**
 *
 * @author anacris
 */
public class Ex_05_Intercalacao {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        bubbleSort(v1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        bubbleSort(v2);
        exibeVetor(v2);
        
        int intercala[] = new int[n1+n2];
        merge2Vetores(intercala,v1,v2);
        
        System.out.println("\nA intercalação dos 2 vetores: ");
        exibeVetor(intercala);
    }

    public static void merge2Vetores(int[] intercala, int[] v1, int[] v2) {
        int i = 0, j = 0, k = 0;
        
        while (i < v1.length && j < v2.length){
            if(v1[i] < v2[j]){
                intercala[k] = v1[i];
                k++;
                i++;
            }else {
                intercala[k] = v2[j];
                k++;
                j++;
            }
        }
        //Analisar as sobras
        while (i < v1.length){
            intercala[k] = v1[i];
            k++;
            i++;
        }
        while (j < v2.length){
            intercala[k] = v2[j];
            k++;
            j++;
        }
    }
    public static void bubbleSort(int v[]){
        for (int i=0; i < v.length-1; i++){
            for (int j=0; j < v.length-1-i; j++){
                if(v[j]>v[j+1])
                    troca(v,j, j+1);
            }
        }
    }
    public static void troca(int v[], int a, int b){
        int aux;
        aux = v[a];
        v[a]= v[b];
        v[b] = aux;
    }
}
