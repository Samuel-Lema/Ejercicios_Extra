package gratificación_extra;

public class Empleados {
    
    private String nome;
    private int nFillos;
    private int hAbsentismo;
    private Gratificacion gratific;
    
    public Empleados(String nome, int nFillos, int absentismo){
        
        this.nome = nome;
        this.nFillos = nFillos;
        this.hAbsentismo = absentismo;
        this.gratific = new Gratificacion(nFillos, hAbsentismo);
    }
    
    // Set's y Get's
    
    public void setNome(String nome){
        
        this.nome = nome;
    }
    public String getNome(){
       
        return "" + nome;
    }
    public void setFillos(int fillos){
        
        this.nFillos = fillos;
        this.gratific.setFixo(fillos);
    }
    public String getFillos(){
        
        return "" + nFillos;
    }
    public void setAbsentismo(int absentismo){
        
        this.hAbsentismo = absentismo;
        this.gratific.setVariable(absentismo);
    }
    public String getAbsentismo(){
        
        return "" + hAbsentismo;
    }
    
    public void obtenerDatos(){
        
        System.out.println("Nome: " + nome + "\r\nNúmero de fillos: " + nFillos + "\r\nHoras ausentes: " + hAbsentismo + "\r\nFixo: " + gratific.getFixo() + "\r\nVariable: " + gratific.getVariable() + "\r\nGratificación total: " + gratific.obtenerGratificacion());
    }
}
