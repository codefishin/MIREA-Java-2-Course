import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        ArrayClass arrayWork = new ArrayClass();

        strings.add("a");
        strings.add("b");
        strings.add("a");
        // 1.1
        System.out.println("Before: " + strings);
        System.out.println("After: " + arrayWork.RemoveDuplicatesStr(strings));
        // 1.2
        System.out.println("Pos: " + arrayWork.GetPosInArray(strings, "b"));
        // 1.3
        Circle myCircle = new Circle(3);
        Circle notMyCircle = new Circle(2);
        Circle myOtherCircle = new Circle (30);

        ArrayList<Circle> circles = new ArrayList<Circle>();
        circles.add(myCircle);
        circles.add(notMyCircle);
        circles.add(myOtherCircle);
        System.out.println("Comparing result: " + arrayWork.GetBiggestCircleValue(circles));
        // 1.4
        int row = 2;
        int column = 3;
        Circle[][] matrixCircles = new Circle[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Circle temp = new Circle((int)(Math.random() * 10)); // от 0 до 9
                matrixCircles[i][j] = temp;
            }
        }
        System.out.println("Matrix of circles: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(matrixCircles[i][j].getRadius());
            }
        }
        System.out.println("Comparing result: " + arrayWork.GetBiggestMatrixCircleValue(matrixCircles));

        //2.2

        Scanner input = new Scanner(System.in);
        System.out.println("Введите 5 строк, разделяя их с Enter");
        IH8STACKS<String> stringsArr = new IH8STACKS<String>(); // чёёё
        for (int i = 0; i < 5; i++) stringsArr.push(input.nextLine());

        ArrayList<String> resultStrings = new ArrayList<String>();
        while (!stringsArr.isEmpty()) {
            resultStrings.add(stringsArr.pop());
        }
        System.out.println("Result: " + resultStrings.toString());
    }


}
