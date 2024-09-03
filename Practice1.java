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
        String yuan_text; // текст юаня
        Scanner input = new Scanner(System.in);

        int yuan = input.nextInt(); // Переменная Юаней
        double ruble = yuan * yuan_rub_conv; // Переменная рублей
        int digit_yuan = yuan % 10; // Последнее число у Юаней

        float rub_result = Math.round(ruble); // Округление результата

        if (yuan == 1) // Юань
        {
            yuan_text = " Китайский Юань равно ";
        }
        else if (digit_yuan > 1 && digit_yuan < 5 && (yuan > 19 || yuan < 10))
        {
            yuan_text = " Китайских Юаня равно ";
        }
        else
        {
            yuan_text = " Китайских Юаней равно ";
        }
        System.out.println(yuan + yuan_text + rub_result + " рублям."); // здесь используются переменные чисел и текстов
    }
}
