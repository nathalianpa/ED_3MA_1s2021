/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Desempenho;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;
import static Aula_01_Vetores.Ex_02_Inverter.troca;

/**
 *
 * @author anacris
 */
public class Ex_02_TrocaPosMaiorMenorVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        trocaPosMaiorMenorVetor(v);
        System.out.println("\nO rearranjo o primeiro elemento: ");
        exibeVetor(v);
    }
    public static void trocaPosMaiorMenorVetor(int v[]){
        int posMaior = 0;
        int posMenor = 0;
        
        for(int i=1; i < v.length; i++){
            if(v[i] > v[posMaior])
                posMaior = i;
            else
                if (v[i] < v[posMenor])
                    posMenor = i;
        }
        //Troca do menor e maior
        troca(v,posMaior,posMenor);
    }
}
