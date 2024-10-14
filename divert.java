package tugasbuPasya;

import java.util.Scanner;

public class divert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("mau list piano/gitar");
        String pilihan = s.nextLine();

        if (pilihan.equalsIgnoreCase("piano")) {
            System.out.println("nama piano: ");
            String name = s.nextLine();
            System.out.println("piano price: ");
            double price=s.nextDouble();
            System.out.println("piano Type: ");
            String pianotype=s.next();
            piano p1 = new piano(name, price, pianotype);
            p1.print();
        }else if(pilihan.equalsIgnoreCase("guitar")){
            System.out.println("nama guitar: " );
            String name=s.next();
            System.out.println("guitar price: " );
            double price=s.nextDouble();
            System.out.println("Is it Electric?true/false: ");
            Boolean isisElectric=s.nextBoolean();
            guitar g1=new guitar(name, price, isisElectric);
            g1.print();
        }
    }
}
