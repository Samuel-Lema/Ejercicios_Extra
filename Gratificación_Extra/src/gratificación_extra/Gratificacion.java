package gratificación_extra;

public class Gratificacion {
    
    private double fixo;
    private int variable;
    
    public Gratificacion(int fillos, int absentismo){
        
        if(fillos == 0){
            
            fixo = 180;
        } else if(fillos == 1){
            
            fixo = 240;
        } else if(fillos == 2){
            
            fixo = 300;
        } else if(fillos > 2){
            
            fixo = 360;
        }
        
        variable = 360 - (6 * absentismo);
        
        if(variable < 0){
            variable = 0;
        }
    }
    
    public void setFixo(int fillos){
        
        if(fillos == 0){
            
            fixo = 180;
        } else if(fillos == 1){
            
            fixo = 240;
        } else if(fillos == 2){
            
            fixo = 300;
        } else if(fillos > 2){
            
            fixo = 360;
        }
    }
    
    public void setVariable(int absentismo){
        
        variable = 360 - (6 * absentismo);
        
        if(variable < 0){
            variable = 0;
        }
    }
    public String getFixo(){
        
        return "" + fixo;
    }
    public String getVariable(){
        
        return "" + variable;
    }
    
    public String obtenerGratificacion(){
        
        return (fixo + variable) + " euros.";
    }
}
