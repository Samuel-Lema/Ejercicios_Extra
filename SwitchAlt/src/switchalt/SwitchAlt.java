package switchalt;

public class SwitchAlt {

    public static void main(String[] args) {
        
        int condicional = 0;
        
        for(int i = 0; i < 6; i++){
            
            switch(condicional){
                case 0: System.out.println("Hola"); condicional = 1; break;
                case 1: System.out.println("Adios"); condicional = 0;
            }
            
        }
    }
    
}
