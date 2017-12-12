package alumnoejemplo;

public class Ensinante extends Persona {

    private String materia;
    
    // Constructor
    
    public Ensinante(String nome, String direccion, String materia) {
        
        super(nome, direccion);
        this.materia = materia;
    }
    // Setter & Getter

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    // To String

    @Override public String toString() {
        
        return "Ensinante{" + "nome=" + super.getNome() + ", direccion=" + super.getDireccion() + ", materia=" + materia + '}';
    }
    
    
}
