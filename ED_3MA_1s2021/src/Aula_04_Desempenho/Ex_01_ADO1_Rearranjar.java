/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Desempenho;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;
import static Aula_01_Vetores.Ex_02_Inverter.troca;

/**
 *
 * @author anacris
 */
public class Ex_01_ADO1_Rearranjar {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        //int v[] = leVetor(n);
        exibeVetor(v);
        
        rearranjar(v);
        System.out.println("\nO rearranjo o primeiro elemento: ");
        exibeVetor(v);
    }
    
    public static void rearranjar(int v[]){
        int pivo = v[0];
        int i = 1;
        int j = v.length -1;
        
        //Enquanto não se cruzarem
        while (i <= j){
            if(v[i] <= pivo){
                i++;
            }
            else {
                if (v[j] > pivo){
                    j--;
                }
                else {
                    troca(v,i,j);
                    i++;
                    j--;
                }
            }   
        }
        //Trocar o pivô com o elemento da posição j
        troca(v,0,j);
    }
}
