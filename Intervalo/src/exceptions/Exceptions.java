package exceptions;

public class Exceptions {

    public static void main(String[] args) throws IntervaloException {
        
        // Calcular unha division de 2 números. De xeito co numerador ten que estar entre 20 e 100.
        // Do contrario saltara unha excepcion. Propagamos e capturamos no metodo (ambas).
        
        // Dividindo ca Excepción propagada
        
        DividirNoIntervalo captura1 = new DividirNoIntervalo();
        
        try {
            
            captura1.dividirCaptura();
        } catch(IntervaloException e1) {
            
            System.out.println(e1.getMessage());
        }
        
        // Dividindo ca Excepción no metodo
        
        DividirNoIntervalo captura2 = new DividirNoIntervalo();
        captura2.dividirCapturaNoMetodo();
    }
    
}
