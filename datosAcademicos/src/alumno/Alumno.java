
package alumno;

import java.util.Scanner;

public class Alumno {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String alumno;
        
        datosAlumno alumno1 = new datosAlumno("Samuel", "01", 10, "Vigo", "635241538");
        datosAlumno alumno2 = new datosAlumno("Nina", "02", 8, "Vigo", "635241537");
        System.out.print(alumno1.toString());

        System.out.println("\r\nDe quien quieres saber la nota?");
        alumno = reader.next();
        
        if(alumno1.getNome().equals(alumno)){
            System.out.println("\r\nSu nota es: " + alumno1.getNota());
        } else if(alumno2.getNome().equals(alumno)) {
            System.out.println("\r\nSu nota es: " + alumno2.getNota());
        } else {
            System.out.println("\r\nNo existe el alumno.");
        }
     
    }
    
}
