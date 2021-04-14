/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_01_Busca_Linear {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        //int v[] = leVetor(n);
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.print("\nDigite o número que deseja buscar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(buscaLinear(v,x)){
            System.out.printf("%d está no vetor",x);
        } else {
            System.out.printf("%d NAO está no vetor",x);
        }
    }

    public static int leInteiroPositivo() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("\nDigite um número positivo: ");
            n = sc.nextInt();
        } while (n<=0 || n>=100000);
        return n;
    }

    public static int[] leVetor(int n) {
        int v[] = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os elementos do vetor: ");
        for(int i=0; i<v.length; i++){
            System.out.printf("v[%d] = ",i);
            v[i]=sc.nextInt();
        }
        return v;
    }
    public static int[] leVetorAleatorio(int n) {
        int v[] = new int[n];
       
        for(int i=0; i<v.length; i++){
            v[i]=(int) (Math.random()*100);
        }
        return v;
    }

    public static void exibeVetor(int[] v) {
        for(int elemento: v){
            System.out.print(elemento + " ");
        }
    }

    public static boolean buscaLinear(int[] v, int x) {
        for(int i=0; i<v.length; i++){
            if(v[i] == x)
                return true; //Achou
        }
        return false; //Achou
    }
    
}
