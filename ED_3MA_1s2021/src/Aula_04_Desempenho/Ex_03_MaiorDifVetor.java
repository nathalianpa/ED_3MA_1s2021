/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Desempenho;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_03_MaiorDifVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);       
        int dif[] = maiorDifVetor(v);
        System.out.println("\nA diferença (a-b) maior possível: ");
        exibeVetor(dif);
    }
    public static int[] maiorDifVetor(int v[]){
        int posMaior = 0;
        int posMenor = 0;
        
        for(int i=1; i < v.length; i++){
            if(v[i] > v[posMaior])
                posMaior = i;
            else
                if (v[i] < v[posMenor])
                    posMenor = i;
        }
        int res[] = {v[posMaior], v[posMenor]};
        return res;
    }
}
