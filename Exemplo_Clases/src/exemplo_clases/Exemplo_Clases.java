package exemplo_clases;

public class Exemplo_Clases {

    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo(8, 9);
        
        System.out.println("Rectangulo 1: " + rectangulo1.toString());
        System.out.println("Rectangulo 1: " + rectangulo1.calcularArea());
        
        Rectangulo rectangulo2 = new Rectangulo(6);
        
        System.out.println("Rectangulo 2: " + rectangulo2.toString());
        
        Rectangulo rectangulo3 = rectangulo1.incrementar();
        
        System.out.println("Rectangulo 3: " + rectangulo3.toString());
        
        Rectangulo rectangulo4 = rectangulo1.mudarBase();
        
        System.out.println("Rectangulo 4: " + rectangulo4.toString());
    }
    
}
