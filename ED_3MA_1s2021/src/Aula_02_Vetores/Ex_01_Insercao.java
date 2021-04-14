/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_01_Insercao {
    public static void main(String[] args) {
        int v[] = new int[50];
        System.out.println("Digite o tamanho do vetor (<=50): ");
        int n = leInteiroPositivo();
        leVetorTam(v,n);
        exibeVetorTam(v,n);
        //exibeVetor(v);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o elemento que deseja inserir: ");
        int x = sc.nextInt();
        
        System.out.println("\nEm qual posição deseja inserir(0<pos<=n): ");
        int pos = sc.nextInt();
        
        insercao(v,n,x,pos);
        exibeVetorTam(v,n+1);
        
    }
    //Inserção significa fazer movimentações para a direita, criar um furaco
    public static void insercao(int v[], int n, int x, int pos){
        for(int i=n; i > pos; i--){
            v[i] = v[i-1];
        }
        v[pos]=x;
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
}
