
package alumno;

public class datosAcademicos {
    
    private String referencia;
    private int nota;

    public void setNota(int nota){
        this.nota = nota;
    }
    public int getNota(){
        
        return nota;
    }
    public void setReferencia(String ref){
        referencia = ref;
    }
    public String getRef(){
        
        return referencia;
    }
}