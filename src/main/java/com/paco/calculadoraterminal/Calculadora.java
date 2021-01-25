package com.paco.calculadoraterminal;

import java.util.ArrayList;

/**
 *
 * @author paco
 */
public class Calculadora {

    private double op;
    private ArrayList<String> log;

    public Calculadora(double i) {
        log = new ArrayList<>();
        this.op=i;
    }

    public double getOp() {
        return op;
    }

    public void setOp(double op) {
        this.op = op;
    }

    public ArrayList<String> getLog() {
        return log;
    }

    public void setLog(ArrayList<String> log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "op=" + op + ", log=" + log + '}';
    }
  
    public double operar(String operacion){

        try{
            double d = Double.parseDouble(operacion);
            op=d;
            return op;
        } catch(NumberFormatException ex){
            switch(operacion){
                case "sqrt" -> op=Math.sqrt(op);
                case "sin" -> op=Math.sin(op);
                case "cos" -> op=Math.cos(op);
                case "inv" -> op=1/op;
            }
            log.add(operacion);
            log.add(op+"");
            return op;            
        }        

    }
    
    public double operar(String operacion,String operador){
 
        switch(operacion){
            case "+" -> op=op+Double.parseDouble(operador);
            case "-" -> op=op-Double.parseDouble(operador);
            case "*" -> op=op*Double.parseDouble(operador);
            case "/" -> op=op/Double.parseDouble(operador);
        }
        log.add(operacion);
        log.add(op+"");
        return op;
        
    }
    
    static boolean necesitaOperador(String operacion){       
        return("*,+,-,/".contains(operacion));
    }
    
}