/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetor;
import static Aula_02_Vetores.Ex_01_Insercao.exibeVetorTam;
import static Aula_02_Vetores.Ex_02_Remocao.buscaLinear;

/**
 *
 * @author anacris
 */
public class Ex_03_Interseccao {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetor(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int v2[] = leVetor(n2);
        exibeVetor(v2);
        
        int inter[] = new int[n1];
        int k = inter2Vetores(inter, v1, v2);
        System.out.println("\nOs elementos da intersecção são: ");
        exibeVetorTam(inter,k);
    }
    public static int inter2Vetores(int inter[], int v1[], int v2[]){
        int k =0;
        for(int i = 0; i < v1.length; i++){
            if(buscaLinear(v2,v1[i]) != -1){
                inter[k] = v1[i];
                k++;
            }
        }
        return k;
    }
}
