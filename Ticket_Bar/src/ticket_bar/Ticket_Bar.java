package ticket_bar;

import java.util.Scanner;

public class Ticket_Bar {

    public static void main(String[] args) {
        
        String barName = "Bar Pepe";
        double cocaCola = 2.5, auga = 1, pagado;
        int nCocaCola, nAuga;
        Scanner reader = new Scanner(System.in);
        double total;
        
        System.out.print("Nº de coca colas compradas: ");
        nCocaCola = reader.nextInt();
        System.out.print("Nº de augas compradas: ");
        nAuga = reader.nextInt();
        System.out.print("Dinero pagado: ");
        pagado = reader.nextDouble();
        
        total = (nCocaCola * cocaCola) + (nAuga * auga);
        
        System.out.println("\r\n|     " + barName);
        if (nCocaCola > 0) {
            System.out.println("| " + nCocaCola + " Colas --> " + (nCocaCola * cocaCola));
        }
        if (nAuga > 0) {
            System.out.println("| " + nAuga + " augas --> " + (nAuga * auga));
        }
        System.out.println("|             ____");
        System.out.println("| Total       " + total + "\r\n|");
        System.out.println("| Entregado   " + pagado);
        System.out.println("| Devolto     " + (pagado - total));
        System.out.println("|   Grazas por vir   \r\n|");
        System.out.println("|___________________|");
    }
    
}
