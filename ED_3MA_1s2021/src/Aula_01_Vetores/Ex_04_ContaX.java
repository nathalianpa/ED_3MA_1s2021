/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

import static Aula_01_Vetores.Ex_01_Busca_Linear.buscaLinear;
import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_04_ContaX {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetor(n);
        exibeVetor(v);
        
        System.out.print("\nDigite o número que deseja buscar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.printf("\n%d aparece %d vezes no vetor",x,contaX(v,x));
         
    }
    public static int contaX(int v[], int x){
        int cont=0;
        for(int i=0; i<v.length; i++){
            if(v[i] == x)
                cont++;
        }
        return cont;
    }
}
