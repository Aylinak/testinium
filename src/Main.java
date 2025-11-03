import java.util.Scanner;
public static void main(String[] args){

            Scanner sc = new Scanner(System.in,"UTF-8");

            System.out.print("Adınızı ve soyadınızı giriniz: ");
            String name = sc.nextLine().trim();

            System.out.print("Şifrenizi giriniz: ");
            String password = sc.nextLine().trim();

            if(name.equals("kullanici") && password.equals("1234")){
                System.out.print("Başarılı");

            }

            else{
                System.out.print("Başarısız");
            }
        }





