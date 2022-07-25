import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      System.out.println("1--Toplama");
      System.out.println("2--Çıkarma");
      System.out.println("3--Bölme");
      System.out.println("4--Çarpma");
      
      System.out.println("Yapılacak işlem numarasını girisiniz : ");
      int islemler = input.nextInt();
      System.out.println("Birinci sayıyı giriniz : ");
      int sayi1 = input.nextInt();
      System.out.println("İkinci sayıyı giriniz : ");
      int sayi2 = input.nextInt();
      
      if(islemler == 1)
      {
          System.out.println("Toplam = " + (sayi1 + sayi2));
      }
      if(islemler == 2)
      {
          System.out.println("Fark = " + (sayi1 - sayi2));
      }
      if(islemler == 3)
      {
          System.out.println("Bölüm = " + (sayi1 / sayi2));
      }
      if(islemler == 4)
      {
          System.out.println("Çarpım = " + (sayi1 * sayi2));
      }
      input.close();
      
    }
}
