import java.sql.SQLOutput;
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, sum1 = 1, sum2 = 1, sum3 = 1, com;


        System.out.print("Lütfen 1. Sayıyı Giriniz: ");
        num1 = input.nextInt();

        System.out.print("Lütfen 2. Sayıyı Giriniz: ");
        num2 = input.nextInt();

        for (int i = 1; i <= num1; i++)
        {
            sum1 = sum1 * i;
        }

        for (int i = 1; i <= num2; i++)
        {
            sum2 = sum2 * i;
        }

        num3 = num1 - num2;

        for (int i = 1; i <= num3; i++)
        {
            sum3 = sum3 * i;
        }

        com = sum1 / (sum2 * sum3);

        System.out.print("C("+num1+","+num2+") Kombinasyonunun Değeri: "+com);


    }
}
