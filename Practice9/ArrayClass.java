import java.util.ArrayList;
import java.util.Objects;

public class ArrayClass{
    public ArrayClass() {}

    public ArrayList<String> RemoveDuplicatesStr(ArrayList<String> Arr) {
        ArrayList<String> Result = new ArrayList<String>();
        for (String str : Arr) {
            if (!Result.contains(str)) { Result.add(str); }
        }
        return Result;
    }

    public int GetPosInArray(ArrayList<String> Arr, String word) {
        for (int i = 0; i < Arr.size(); i++) {
            if (Objects.equals(Arr.get(i), word)) { return i + 1; }
        }
        return -1;
    }

    public int GetBiggestCircleValue(ArrayList<Circle> Arr) {
        Circle max = new Circle();
        for (Circle circ : Arr) {
            if (max.compareTo(circ) < 0) { max = circ; }
        }
        return max.getRadius();
    }
    public int GetBiggestMatrixCircleValue(Circle[][] Arr) {
        Circle max = new Circle();
        int row = Arr.length;
        int column = Arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max.compareTo(Arr[i][j]) < 0) { max = Arr[i][j]; }
            }
        }
        return max.getRadius();
    }
}

