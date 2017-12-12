package alumnoejemplo;

public class AlumnoEjemplo {

    public static void main(String[] args) {
        
        Estudante jorge = new Estudante("Jorge", "Garcia Barbon", "Daniel Castelao", 10);
        jorge.toString();
                
        Ensinante ramon = new Ensinante("Ramon", "Policarpo Sanz", "Programación");
        ramon.toString();
        
        EstudanteInternacional christian = new EstudanteInternacional("Christian", "Granvia", "Daniel Castelao", 10, "Alemania");
        christian.toString();
        
        jorge.setNivel(8);
        jorge.getNivel();
        
        ramon.setMateria("Contornos");
        ramon.getMateria();
    }
    
}
