import java.util.Scanner;

/* // ПЕРВОЕ ЗАДАНИЕ
* public class Main
* {
*   public static void main(String[] args)
*   {
*       final double yuan_rub_conv = 11.91;
*       int yuan;
*       double ruble;
*       Scanner input = new Scanner(System.in);
        yuan = input.nextInt();
        ruble = yuan * yuan_rub_conv;
        System.out.println(ruble);
*   }
* */
// ВТОРОЕ ЗАДАНИЕ
public class Main
{
    public static void main(String[] args)
    {
        final double yuan_rub_conv = 11.91; // курс
        int yuan; // юани
        double ruble; // рубли
        int digit_rub;
        int digit_yuan;
        Scanner input = new Scanner(System.in);
        yuan = input.nextInt();
        ruble = yuan * yuan_rub_conv;
        digit_yuan = yuan % 10;
        digit_rub = (int)ruble % 10; // привидение, бу
        if (yuan == 1) // Китайский Юань
        {
            if (digit_rub > 1 && digit_rub < 5) // Рубля
            {
                System.out.println(yuan + " Китайский Юань равен " + ruble + " рубля");
            }
            else if (ruble == 1) // Рубль
            {
                System.out.println(yuan + " Китайский Юань равен " + ruble + " рубль");
            }
            else // Рублей
            {
                System.out.println(yuan + " Китайский Юань равен " + ruble + " рублей");
            }
        }
        else if (digit_yuan > 1 && digit_yuan < 5) // Китайских Юаня
        {
            if (digit_rub > 2 && digit_rub < 5)
            {
                System.out.println(yuan + " Китайских Юаня равен " + ruble + " рубля");
            }
            else if (ruble == 1)
            {
                System.out.println(yuan + " Китайских Юаня равен " + ruble + " рубль");
            }
            else
            {
                System.out.println(yuan + " Китайских Юаня равен " + ruble + " рублей");
            }
        }
        else // Китайских Юаней
        {
            if (digit_rub > 2 && digit_rub < 5)
            {
                System.out.println(yuan + " Китайских Юаней равен " + ruble + " рубля");
            }
            else if (ruble == 1)
            {
                System.out.println(yuan + " Китайских Юаней равен " + ruble + " рубль");
            }
            else
            {
                System.out.println(yuan + " Китайских Юаней равен " + ruble + " рублей");
            }
        }
    }
}
