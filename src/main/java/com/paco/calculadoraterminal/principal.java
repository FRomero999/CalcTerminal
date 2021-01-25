/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paco.calculadoraterminal;

import java.util.Scanner;

/**
 *
 * @author paco
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(0);
        
        Scanner sc = new Scanner(System.in);
               
        while(true){
            
            System.out.println("["+calc.getOp()+"]");
            
            String op=sc.next();
            
            if("q".equals(op)) return;
            
            if(Calculadora.necesitaOperador(op)){
                String op1=sc.next();
                calc.operar(op, op1);
            }else{
                calc.operar(op);
            }
        }
        
    }
    
}
