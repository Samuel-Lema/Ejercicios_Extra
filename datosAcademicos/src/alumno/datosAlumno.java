
package alumno;

public class datosAlumno {
    
    private String nome;
    private datosAcademicos academicos;
    private datosPersoais persoa;
    
    public datosAlumno(){
        
       academicos = new datosAcademicos();
       persoa = new datosPersoais();
    }
    public datosAlumno(String nome, String referencia, int nota, String direccion, String telefono){
        
       this.nome = nome;
       
       academicos = new datosAcademicos();
       academicos.setReferencia(referencia);
       academicos.setNota(nota);
       
       persoa = new datosPersoais();
       persoa.setDireccion(direccion);
       persoa.setTelefono(telefono);
    }
    
    public String getNome(){
        return nome;
    }
    public String getNota(){
        
        return "" + academicos.getNota();
    }
    
    @Override public String toString(){
        
        return "Nombre: " + nome + "\r\nReferencia: " + academicos.getRef() + ", Nota: " + academicos.getNota() + "\r\nDirección: " + persoa.getDireccion() + ", Telefono: " + persoa.getTelefono();
    }
}
