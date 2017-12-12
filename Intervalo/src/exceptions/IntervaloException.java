package exceptions;

public class IntervaloException extends Exception{
    
    public IntervaloException(){
        super("Non esta entre o intervalo.");
    }
    public IntervaloException(String msg){
        super(msg);
    }
}
