import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
      String pass = "Alper46";
      System.out.println("Lütfen bir şifre giriniz.");
      Scanner input = new Scanner(System.in);
      String userpass = input.nextLine();
      
      
      if(userpass.equals(pass))
      {
          System.out.println("Giriş Başarılı..");
      }
      
      else
      {
          System.out.println("Giriş Başarısız..");
      }
      input.close();
      
    }
}
