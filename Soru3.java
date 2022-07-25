import java.util.Scanner; 
public class Main2 {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      
      System.out.println("Bir sayı giriniz : ");
      int sayi1 = input.nextInt();
      System.out.println("Bir sayı giriniz : ");
      int sayi2 = input.nextInt();
      
      if(sayi1 > sayi2)
      {
          System.out.println(sayi1 + " > " + sayi2);
      }
      if(sayi1 < sayi2)
      {
          System.out.println(sayi1 + " < " + sayi2);
      }
      if(sayi1 == sayi2)
      {
          System.out.println(sayi1 + " = " + sayi2);
      }
      
      input.close();
      
    }
}
