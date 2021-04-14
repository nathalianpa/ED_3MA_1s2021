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
import static Aula_04_Desempenho.Ex_04_Inter2VetoresOrdenados.exibeInter2VetoresOrd;

/**
 *
 * @author anacris
 */
public class Ex_05_ComprSegmentoCresc {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetor(n);
        exibeVetor(v);
        
        System.out.println("\nO maior segmento crescente tem"
                + " comprimento = " + maiorSegmentoCresc(v));
 
    }
    public static int maiorSegmentoCresc(int v[]){
        int cont=1;
        int max=1;
        
        for(int i=0; i<v.length-1;i++){
            if(v[i] < v[i+1]){
                cont++;
            }
            else {
                if(cont > max){
                    max = cont;
                    cont = 1;
                }
            }
        }
        //Condição especial de vetor ordenado
        if(cont > max)
           max = cont;
        
        return max;
    }
}
