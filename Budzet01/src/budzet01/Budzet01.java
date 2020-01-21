package budzet01;

import java.util.Scanner;

public class Budzet01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int budzet, trosak1, trosak2, trosak3, trosak4, trosak5;
        System.out.println("Unnesite raspolozivi budzet: ");
        budzet = input.nextInt();
        System.out.println("Unesite trosak za beznzin: ");
        trosak1 = input.nextInt();
        budzet -= trosak1;
        System.out.println("Preostali iznos budzeta posle izdataka za benzin: " + budzet);
        System.out.println("Unesite trosak za restoran: ");
        trosak2 = input.nextInt();
        budzet -= trosak2;
        System.out.println("Preostali iznos budzeta posle izdataka za restoran: " + budzet);
        System.out.println("Unesite trosak za kredit:");
        trosak3 = input.nextInt();
        budzet -= trosak3;
        System.out.println("Preostali iznos budzeta posle izdataka za kredit: " + budzet);
        System.out.println("Unesit trosak za letovanje: ");
        trosak4 = input.nextInt();
        budzet -=trosak4;
        System.out.println("Preostali iznos budzeta posle izdataka za letovanje: " + budzet);
        System.out.println("Unesite izdatak za komunalije: ");
        trosak5 = input.nextInt();
        budzet -=trosak5;
        if(budzet >= 0){
            System.out.println("Vas budzet je : " + budzet);
        }
        else{
            System.out.println("U minusu ste. Vodite racuna o svojim finasijama: "+ budzet);
        }
        
        
        

    }

}
