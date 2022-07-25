import java.util.Random;
import java.util.Scanner;
public class Main1
{
    public static void main(String[] args) {
        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);
        
        double toplam = 0;
        System.out.print("Kaç adet sayı üretilecek ? ");
        int adet = input.nextInt();
        for(int i = 0; i < adet; i++)
        {
            int sayi = 50 + rastgele.nextInt(50);
            System.out.print(sayi + " ");
            toplam += sayi;
        }
        System.out.println();
        System.out.println("Üretilen 10 sayının toplamı : " + toplam);
        System.out.println("Üretilen 10 sayının ortalaması : " + toplam/adet);
        input.close();
    }
}
