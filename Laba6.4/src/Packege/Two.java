package Packege;
import java.util.Scanner;
public class Two {
    public int msi2080 = 25000;
    public int msi2060 = 20000;
    public int msi1050 = 16500;

    public void MSI () {
        Scanner s = new Scanner(System.in);

        System.out.println("Введіть ціну");
        int d = s.nextInt();
        if (d >= msi1050 && d < msi2060) {
            System.out.println("Вам підходить відеокарта MSI яка є у нас в наявності. MSI за "+msi1050+" грн");
        }
        else if (d >= msi2060 && d < msi2080){
            System.out.println("Вам підходять відеокарти MSI яка є у нас в наявності. MSI2060 за "+msi2060+" грн і відеокарта MSI1050 за "+msi1050+" грн");
        }
        else if (d >= msi2080){
            System.out.println("Вам підходять відеокарти ASUS яка є у нас в наявності. MSI2080 за "+msi2080+" грн, відеокарта MSI2060 за "+msi2060+" і відеокарта MSI1050 за " +msi1050+" грн");
        }
        else {
            System.out.println("У вас недостатнь коштів для покупки відеокарт MSI які є у нас в наявності!");
        }
    }
}