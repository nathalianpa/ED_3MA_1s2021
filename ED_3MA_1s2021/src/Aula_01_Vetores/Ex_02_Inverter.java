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
public class Ex_02_Inverter {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        inverterVetor(v);
        System.out.println("\nO vetor invertido:");
        exibeVetor(v);
    }

    public static void inverterVetor(int[] v) {
        int ini = 0;
        int fim = v.length-1;
        
        while(ini < fim){
            /**
            int aux = v[ini];
            v[ini] = v[fim];
            v[fim] = aux; **/
            
            troca(v,ini,fim);
            ini++;
            fim--;
        }
    }

    public static void troca(int[] v, int i, int j) {
        int aux = v[i];
            v[i] = v[j];
            v[j] = aux;
    }
}
