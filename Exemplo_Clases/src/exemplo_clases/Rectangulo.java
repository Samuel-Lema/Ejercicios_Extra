package exemplo_clases;

public class Rectangulo {
    
    private float base;
    private float altura;
    
    // Constructores
    
    public Rectangulo(){
        
    }
    public Rectangulo(float base){
        
        this(base, 4);
    }
    public Rectangulo(float base, float altura){
        
        this.base = base;
        this.altura = altura;
    }
    
    // Sets y Gets
    
    public void setBase(float base){
        
        this.base = base;
    }
    public String getBase(){
        
        return "" + base;
    }
    public void setAltura(float altura){
        
        this.altura = altura;
    }
    public String getAltura(){
        
        return "" + base;
    }
    
    // Funciones
    
    public Rectangulo incrementar(){
        
        base++;
        altura += 2;
        return this;
    }
    public Rectangulo mudarBase(){
        
        base = 15;
        return this;
    }
    public String calcularArea(){
        
        return "Area (" + (base * altura) + ").";
    }
    
    // To String
    
    @Override public String toString(){
        
        return "Base (" + base + ") y Altura (" + altura + ").";
    }
}
