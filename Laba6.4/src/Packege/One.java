package Packege;
import java.util.Scanner;
public class One {
    public int asus3090 = 90000;
    public int asus3080 = 61000;
    public int asus3070 = 40000;

    public void Asus (){
        Scanner s = new Scanner(System.in);

        System.out.println("Введіть ціну");
        int d = s.nextInt();
        if (d >= asus3070 && d < asus3080){
            System.out.println("Вам підходить відеокарта ASUS яка є у нас в наявності. Asus3070 за "+asus3070+" грн");
        }
        else if(d >= asus3080 && d < asus3090){
            System.out.println("Вам підходять відеокарти ASUS яка є у нас в наявності. Asus3080 за "+asus3080+" грн і відеокарта Asus3070 за "+asus3070+" грн");
        }
        else if(d >= asus3090){
            System.out.println("Вам підходять відеокарти ASUS яка є у нас в наявності. Asus3090 за "+asus3090+" грн і відеокарта Asus3080 за "+asus3080+" і відеокарта Asus3070 за " +asus3070+" грн");

        }
    }
}