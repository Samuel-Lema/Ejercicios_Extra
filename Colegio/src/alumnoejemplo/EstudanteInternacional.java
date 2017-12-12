package alumnoejemplo;

public class EstudanteInternacional extends Estudante {
    
    private String pais;
    
    // Constructor
    
    public EstudanteInternacional(String nome, String direccion, String nomeCole, int nivel, String pais) {
        
        super(nome, direccion, nomeCole, nivel);
        this.pais = pais;
    }
    
    // Setter & Getter

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    // To String

    @Override public String toString() {
        
        return "EstudanteInternacional{" + "nome=" + super.getNome() + ", direccion=" + super.getDireccion() + ", nomeCole=" + super.getNomeCole() + ", nivel=" + super.getNivel() + ", pais=" + pais + '}';
    }
    
    
    
}
