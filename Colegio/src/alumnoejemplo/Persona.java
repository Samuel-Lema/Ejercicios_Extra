package alumnoejemplo;

public class Persona {
    
    private String nome;
    private String direccion;

    // Constructor

    public Persona(String nome, String direccion) {
        this.nome = nome;
        this.direccion = direccion;
    }
    
    // Setter & Getter
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // To String

    @Override public String toString() {
        return "Persona{" + "nome=" + nome + ", direccion=" + direccion + '}';
    }
}
