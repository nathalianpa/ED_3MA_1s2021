/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Recursão;

import static Aula_01_Vetores.Ex_01_Busca_Linear.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_03_Primo {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        if(ePrimoR(n))
            System.out.println(n + " É primo.");
        else
            System.out.println(n + " Não é primo.");
    }
    
    public static boolean ePrimo(int n){
        for (int i=2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
         
    }
    /*
    public static boolean ePrimoR(int n){
        return ePrimoR(n,n-1);
    }
    
    public static boolean ePrimoR(int n, int i){
        if(i == 1)
            return true;
        
        if (n % i == 0)
            return false;
       
        return ePrimoR(n,i-1);     
    }
    */
    
    public static boolean ePrimoR(int n){
        return ePrimoR(n,2);
    }
    public static boolean ePrimoR(int n, int i){
        if(i == n)
            return true;
        
        if (n % i == 0)
            return false;
       
        return ePrimoR(n,i+1);     
    }
}
