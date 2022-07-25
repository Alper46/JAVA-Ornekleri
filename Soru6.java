import java.util.Random;
import java.util.Scanner;
public class Main2
{
    public static void main(String[] args) {
        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);
         int sayi = 1 + rastgele.nextInt(50);
         int tahmin , sayac = 0; 
         System.out.println("Sayı 0-50 aralığndadır.");
         System.out.print("Bir sayı giriniz : ");
        do
        {
            tahmin = input.nextInt();
            if(tahmin > sayi)
            {
                System.out.print("Daha küçük bir değer giriniz : ");
            }
            else if(tahmin < sayi)
            {
                System.out.print("Daha büyük bir değer giriniz : ");
            }
            sayac++;
        }
        while(tahmin != sayi);
        
        System.out.println("Tebrikler " + sayac + ". denemede buldunuz.");
        
        input.close();
    }
}
