/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author EtecMorato
 */
public class Somar {
    
    public static void main(String[] args) {
        
        //Var
         int num1, num2, total, op;
         
        //instançia
         Scanner entrada = new Scanner(System.in);
        
     do{
         
        //App Soma
         System.out.println("\n\t\t\t -- Calculadora -- \n");
        
        //Menu
         System.out.println("1.Soma ");
         System.out.println("2.Subtração");
         System.out.println("3.Multiplicação ");
         System.out.println("4.divisão ");
         System.out.println("5.Sair ");
        
        //opção do usuario
         System.out.println("\n\t\t---Opção:---\n");
          op = entrada.nextInt();
        
        if(op == 1){
            
        //apresentação
         System.out.println("\n\t\t\t -- Soma -- \n");
            
        //entrada 
         System.out.print("Digite o 1º número: ");
          num1 = entrada.nextInt();
        
         System.out.print("Digite o 2º número: ");
          num2 = entrada.nextInt();
        
        //processamento
         total= num1 + num2;
        
        //saída
         System.out.print("O resultado da soma é: " + total);
        
        }else if(op ==2){
            
        //apresentação     
        System.out.println("\n\t\t\t -- Subtração -- \n");
           
        //entrada
         System.out.println("Digite o 1º numero: ");
          num1 = entrada.nextInt();
         
         System.out.println("Digite o 2º numero: ");
          num2 = entrada.nextInt();
         
        //processamento
         total= num1 - num2;
        
        //saida
         System.out.print("O resultado da subtração é: " + total);
        
        }else if (op == 3){
            
        //apresentação
         System.out.println("\n\t\t\t -- Multiplicação -- \n"); 
         
        //entrada  
         System.out.println("Digite o 1º numero:");
          num1 = entrada.nextInt();           
            
         System.out.println("Digite o 2º numero:");
          num2 = entrada.nextInt();
          
        //processamento
         total = num1 * num2;
        //saida
            System.out.println("O resultado da subtração é: " + total);
            
        }else if (op == 4){
            
        //apresentação
         System.out.println("\n\t\t\t -- Divisão -- \n"); 
         
        //entrada  
         System.out.println("Digite o 1º numero:");
          num1 = entrada.nextInt();           
            
         System.out.println("Digite o 2º numero:");
          num2 = entrada.nextInt();
        
        //processamento
         total = num1 / num2;
         
        //saida
            System.out.println("O resultado da Divisão é: " + total);
        
        }else if(op == 5){
            
        //saida sistema
            System.out.println("Valeu");
            
       }else{
           System.out.println("opção inválida!");
        }    
        
        }while(op != 5);
        
}
}
