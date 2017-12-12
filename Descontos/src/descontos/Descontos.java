package descontos;
import java.util.Scanner;

public class Descontos {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        double prezo;
        int unidades;
        
        System.out.print("Introduce o precio do artigo: ");
        prezo = reader.nextDouble();
        System.out.print("Introduce as unidades vendidas: ");
        unidades = reader.nextInt();
        
        Ventas venta1 = new Ventas(prezo, unidades);
        
        System.out.print(venta1.calcularPrecio());
    }
    
}