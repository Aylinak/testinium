import java.util.Scanner;

public class Main{//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args){
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


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
    }




