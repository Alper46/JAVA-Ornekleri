import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        
        for(int i = 1; i <= 10; i++){
           System.out.print( i + "- Bir sayı girin : ");
           int sayi = input.nextInt();
           toplam += sayi;
        }
        System.out.print("Toplam : " + toplam);
        input.close();
    }
}
