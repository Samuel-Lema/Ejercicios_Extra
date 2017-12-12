package gratificación_extra;

import java.util.Scanner;

public class Gratificación_Extra {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        String nome = "";
        int fillos;
        int absentismo;
        
        while(!"*".equals(nome)){
            System.out.print("Introduce el nombre: ");
            nome = reader.next();
            
            if(!"*".equals(nome)){
                
               System.out.print("Introduce el nº de fillos: ");
                fillos = reader.nextInt();
            
                System.out.print("Introduce el nº de horas ausente: ");
                absentismo = reader.nextInt();
            
                Empleados empleadoi = new Empleados(nome, fillos, absentismo);
                empleadoi.obtenerDatos();
            } else {
                System.out.print("Has salido del programa de creacion de usuarios"); break;
            }
        }
        
        /*Empleados empleado1 = new Empleados("Juan", 3, 8);
        Empleados empleado2 = new Empleados("Pepe", 1, 0);
        Empleados empleado3 = new Empleados("Manolo", 0, 24);
            
        empleado1.obtenerDatos();
        empleado2.obtenerDatos();
        empleado3.obtenerDatos();*/
    }
    
}
