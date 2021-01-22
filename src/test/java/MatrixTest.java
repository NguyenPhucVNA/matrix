import com.Operations;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class MatrixTest {
        double [][] matrix = {
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30}
        };
        double[][] sideTrue = {
                {30.0, 25.0, 20.0, 15.0},
                {29.0, 24.0, 19.0, 14.0},
                {28.0, 23.0, 18.0, 13.0},
                {27.0, 22.0, 17.0, 12.0},
                {26.0, 21.0, 16.0, 11.0}
        };
        int lenR = matrix.length;
        int lenC = matrix[0].length;
        double[][] arAr = new double[lenC][lenR];
        @Test
    public void side(){

            for (int hor = 0; hor < lenC; hor++) {
                for (int ver = 0; ver <lenR; ver++) {
                    arAr[hor][ver] = matrix[lenR -1-ver][lenC -1-hor];
                }
            }
            assertArrayEquals(sideTrue,arAr);
        }
}
