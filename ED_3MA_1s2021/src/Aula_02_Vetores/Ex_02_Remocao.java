/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_02_Remocao {
    public static void main(String[] args) {
        int v[] = new int[50];
        System.out.println("Digite o tamanho do vetor (<=50): ");
        int n = leInteiroPositivo();
        leVetorTam(v,n);
        exibeVetorTam(v,n);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o elemento que deseja remover: ");
        int x = sc.nextInt();
        
        int pos = buscaLinear(v,x);
        if(pos != -1){
            remocao(v,n,pos);
            exibeVetorTam(v,n-1);
        } else{
            System.out.println(x + " NÃO está no vetor");
        }
    }
    //Remoção significa fazer movimentações para a esquerda, tampar um furaco
    public static void remocao(int v[], int n, int pos){
        for(int i=pos; i < n-1; i++){
            v[i] = v[i+1];
        }
    }
    
    public static void leVetorTam(int v[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os elementos do vetor: ");
        for(int i=0; i < n; i++){
            System.out.printf("v[%d] = ",i);
            v[i]=sc.nextInt();
        }
    }
    public static void exibeVetorTam(int[] v, int n) {
        for(int i=0; i < n; i++){
            System.out.print(v[i] + " ");
        }
    }
    public static int buscaLinear(int[] v, int x) {
        for(int i=0; i<v.length; i++){
            if(v[i] == x)
                return i; //Achou
        }
        return -1; //Achou
    }
    
}
