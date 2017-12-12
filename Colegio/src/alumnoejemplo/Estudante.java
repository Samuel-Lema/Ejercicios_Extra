package alumnoejemplo;

public class Estudante extends Persona {
    
    private String nomeCole;
    private int nivel;

    // Constructor
    
    public Estudante(String nome, String direccion, String nomeCole, int nivel) {
        
        super(nome, direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    // Setter & Getter

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // To String
    
    @Override public String toString() {
        
        return "Estudante{" + "nome=" + super.getNome() + ", direccion=" + super.getDireccion() + ", nomeCole=" + nomeCole + ", nivel=" + nivel + '}';
    }
    
    
}
