package Packege;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        One asus = new One();
        Two msi = new Two();
        Three gigabyte = new Three();
        Scanner s = new Scanner(System.in);

        System.out.println("У нас є відеокарти трьох фірм Asus, MSI і Gigabyte яку ви б хотіли?");
        String d = s.nextLine();

        if (d.equals("Asus") || d.equals("asus")){
            asus.Asus();
        }
        else if (d.equals("MSI") || d.equals("msi")){
            msi.MSI();
        }
        else if (d.equals("Gigabyte") || d.equals("gigabyte")){
            gigabyte.Gigabyte();
        }
        else {System.out.println("Ви неправильно записали назву!");
        }
    }
}