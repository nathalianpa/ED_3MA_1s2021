/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.exibeVetor;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_01_Vetores.Ex_01_Busca_Linear.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class ADO2_Ex_01_BuscaLinear {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        //int v[] = leVetor(n);
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.print("\nDigite o número que deseja buscar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(buscaLinearR(v,x) != -1){
            System.out.printf("%d está no vetor",x);
        } else {
            System.out.printf("%d NAO está no vetor",x);
        }
    }
    /*
    public static boolean buscaLinearR(int[] v, int x) {
           return buscaLinearR(v,x,v.length-1);
    }
    public static boolean buscaLinearR(int[] v, int x, int i) {
       if(i == 0)
           return false;
       if(v[i] == x)
            return true; //Achou
   
        return buscaLinearR(v,x,i-1);
    }
    */
    
    public static int buscaLinearR(int[] v, int x) {
           return buscaLinearR(v,x,0);
    }
    public static int buscaLinearR(int[] v, int x, int i) {
       if(i == v.length)
           return -1;
       if(v[i] == x)
            return i; //Achou
   
        return buscaLinearR(v,x,i+1);
    }
    public static boolean buscaLinear(int[] v, int x) {
        for(int i=0; i<v.length; i++){
            if(v[i] == x)
                return true; //Achou
        }
        return false; //Achou
    }
}
