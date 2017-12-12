
package alumno;

public class datosPersoais {
    
    private String direccion;
    private String telefono;
    
    public datosPersoais(){
        
    }
   
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        
        return direccion;
    }
    public void setTelefono(String tlf){
        telefono = tlf;
    }    
    public String getTelefono(){
        
        return telefono;
    }
    
}
