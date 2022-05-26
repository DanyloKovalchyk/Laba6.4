package Packege;
import java.util.Scanner;
public class Three {
    public int gigabyte1070 = 15000;
    public int gigabyte1060 = 8000;
    public int gigabyte1050 = 7000;

    public void Gigabyte () {
        Scanner s = new Scanner(System.in);

        System.out.println("Введіть ціну");
        int d = s.nextInt();
        if (d >= gigabyte1050 && d < gigabyte1060) {
            System.out.println("Вам підходить відеокарта Gigabyte яка є у нас в наявності. Gigabyte1050 за "+gigabyte1050+" грн");
        }
        else if (d >= gigabyte1060 && d < gigabyte1070){
            System.out.println("Вам підходять відеокарти Gigabyte яка є у нас в наявності. Gigabyte1060 за "+gigabyte1060+" грн і відеокарта Gigabyte1050 за "+gigabyte1050+" грн");
        }
        else if (d >= gigabyte1070){
            System.out.println("Вам підходять відеокарти Gigabyte яка є у нас в наявності. Gigabyte1070 за "+gigabyte1070+" грн, відеокарта Gigabyte1060 за "+gigabyte1060+" і відеокарта Gigabyte1070 за " +gigabyte1050+" грн");
        }
        else {
            System.out.println("У вас недостатнь коштів для покупки відеокарт Gigabyte які є у нас в наявності!");
        }
    }
}