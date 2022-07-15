import java.util.Scanner;
public class AsalSayii {
    static boolean asal(int sayi) {
        int sayac = 0;
        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0){
                sayac++;
            }
        }
        if (sayac == 0) {
            return true ;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = inp.nextInt();

        if(asal(sayi)) {
            System.out.println("Asal Sayıdır.");
        }else{
            System.out.println("Asal Sayı Değildir.");
        }

    }
}
