package exceptions;

import javax.swing.JOptionPane;

public class DividirNoIntervalo {
    
    private int numerador;
    private int denominador;
    
    public void dividirCaptura() throws IntervaloException{
        
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el númerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
        
        if(numerador < 20 || numerador > 100){
            
            throw new IntervaloException("O númerador no esta entre o intervalo (20-100)");
        } else {
            
            int resultado = numerador / denominador;
            System.out.print(numerador + " / " + denominador + " = " + resultado);
        }
    }
    
    public void dividirCapturaNoMetodo() throws IntervaloException{
        
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el númerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
            
        if(numerador < 20 || numerador > 100){
            
            throw new IntervaloException("O númerador no esta entre o intervalo (20-100)");
        } else {
            
            int resultado = numerador / denominador;
            System.out.print(numerador + " / " + denominador + " = " + resultado);
        }
            
    }
}
