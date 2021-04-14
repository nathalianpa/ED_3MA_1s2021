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
import java.util.Arrays;

/**
 *
 * @author anacris
 */
public class Ex_04_União {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetor(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int v2[] = leVetor(n2);
        exibeVetor(v2);
        
        int uni[] = new int[n1+n2];
        int k = uniao2Vetores(uni, v1, v2);
        System.out.println("\nOs elementos da união são: ");
        exibeVetorTam(uni,k);
        uni = Arrays.copyOf(uni,k);
        System.out.println("\nOs elementos da união são: ");
        exibeVetor(uni);
    }
    public static int uniao2Vetores(int uni[], int v1[], int v2[]){
        int k =0;
        /*
        for(int i = 0; i < v1.length; i++){
             uni[k] = v1[i];
             k++;
        }
*/
        System.arraycopy(v1,0,uni,0,v1.length);
        k = v1.length;
        
        for(int i = 0; i < v2.length; i++){
            if(buscaLinear(v1,v2[i]) == -1){
                uni[k] = v2[i];
                k++;
            }
        }
        return k;
    }
}
