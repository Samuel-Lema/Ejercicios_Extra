package exemplo_bucles;

import java.util.Scanner;

public class Exemplo_Bucles {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        // Bucle FOR
        
        double suma = 0;
        double producto = 1;
        
        for(int i = 1; i <= 7; i++){
            
            System.out.print("Introduce el número " + i + ": ");
            double num = reader.nextDouble();
            suma += num;
            producto *= num;
        }
        
        System.out.println("La suma del (for) es: " + suma);
        System.out.println("El producto del (for) es: " + producto);
        
        // Bucle While
        
        double suma2 = 0;
        double producto2 = 1;
        int i = 1;
        
        while(i <= 7){
            
            System.out.print("Introduce el número " + i + ": ");
            double num = reader.nextDouble();
            suma2 += num;
            producto2 *= num;
            i++;
        }
        
        System.out.println("La suma del (while) es: " + suma2);
        System.out.println("El producto del (while) es: " + producto2);
        
        // Bucle Do While
        
        double suma3 = 0;
        double producto3 = 1;
        int i2 = 1;
        
        do{
            
            System.out.print("Introduce el número " + i2 + ": ");
            double num = reader.nextDouble();
            suma3 += num;
            producto2 *= num;
            i2++;
        } while(i2 < 8);
        
        System.out.print("La suma del (while) es: " + suma3);
        System.out.println("El producto del (do while) es: " + producto3);
    }
    
}