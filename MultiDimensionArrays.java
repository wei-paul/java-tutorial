import java.util.Arrays;
public class MultiDimensionArrays {
  
  public static void main(String[] args) {
    int[][] numbers = { { 1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
    int[][][] greatNumbers = new int[2][4][6];
    greatNumbers[0][0][1] = 2;
    greatNumbers[0][0][4] = 3;
    greatNumbers[0][3][3] = 5;

    //Concept: use deepToString to print out multidimension arrays and not toString.
    System.out.println(Arrays.deepToString(numbers));
    System.out.println(Arrays.deepToString(greatNumbers));
  }
}
