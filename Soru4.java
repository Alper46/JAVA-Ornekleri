import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Rastgele üretilek sayıyı girin : ");
        int sayac = input.nextInt();
        
        
        for(int i = 0; i < sayac; i++)
        {
            int sayi = rastgele.nextInt(30);
            
        if(sayi % 2 == 0)
        {
           System.out.println("Çift sayılar : " + sayi);
        }
        if(sayi % 2 == 1)
        {
            System.out.println("Tek sayılar : " + sayi);
        }
        }
       input.close();
    }
}
