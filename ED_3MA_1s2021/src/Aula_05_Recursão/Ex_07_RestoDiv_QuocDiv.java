/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;
import static Aula_05_Recursão.Ex_03_Potencia.potencia;

/**
 *
 * @author anacris
 */
public class Ex_07_RestoDiv_QuocDiv {
    public static void main(String[] args) {
        System.out.println("Digite n1: ");
        int n1 = leInteiroPositivo();
        System.out.println("Digite n2: ");
        int n2 = leInteiroPositivo();
        
        System.out.printf("RestoDivisao(%d,%d) = %d\n",n1,n2,restoDivisao(n1,n2));
        System.out.printf("QuocienteDivisao(%d,%d) = %d\n",n1,n2,quocDivisao(n1,n2));
    }
    
    public static int restoDivisao(int x, int y){
        if(x < y)
            return x;
        
        return restoDivisao(x-y,y); 
    }
    public static int quocDivisao(int x, int y){
        if(x < y)
            return 0;
        
        return 1+ quocDivisao(x-y,y); //número de vezes que y coube em x
    }
}
