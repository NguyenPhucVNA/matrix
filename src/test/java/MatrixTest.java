import com.Operations;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class MatrixTest {
    double[][] matrix = {
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30}
    };
    double[][] mainTrue={
            {11.0, 16.0, 21.0, 26.0},
            {12.0, 17.0, 22.0, 27.0},
            {13.0, 18.0, 23.0, 28.0},
            {14.0, 19.0, 24.0, 29.0},
            {15.0, 20.0, 25.0, 30.0 }
    };
    double[][] vertical={
            {   26.0,21.0, 16.0,   11.0},
            {   27.0,22.0, 17.0,   12.0},
            {   28.0,23.0, 18.0,   13.0},
            {   29.0,24.0, 19.0,   14.0},
            {   30.0,25.0, 20.0,   15.0}
    };
    double[][] sideTrue = {
            {30.0, 25.0, 20.0, 15.0},
            {29.0, 24.0, 19.0, 14.0},
            {28.0, 23.0, 18.0, 13.0},
            {27.0, 22.0, 17.0, 12.0},
            {26.0, 21.0, 16.0, 11.0}
    };
    double[][] horizontalTrue ={
            {15.0, 20.0, 25.0, 30.0},
            {14.0, 19.0, 24.0, 29.0},
            {13.0, 18.0, 23.0, 28.0},
            {12.0, 17.0, 22.0, 27.0},
            {11.0, 16.0, 21.0, 26.0}
    };

    int lenR = matrix.length;
    int lenC = matrix[0].length;
    double[][] arAr = new double[lenC][lenR];
    double [] ar = new double[lenR];
    @Test
    public void side() {

        for (int hor = 0; hor < lenC; hor++) {
            for (int ver = 0; ver < lenR; ver++) {
                arAr[hor][ver] = matrix[lenR - 1 - ver][lenC - 1 - hor];
            }
        }
        assertArrayEquals(sideTrue, arAr);
    }
    @Test
    public void vertical() {

        for (int hor = 0; hor < lenC; hor++) {
            if (lenR != lenC) {
                    for (int ver = 0; ver < lenR; ver++) {
                       ar[ver] = matrix[ver][hor];
                    }
                }
           else{
              for (int ver = 0; ver < lenR; ver++) {
               ar[ver] = matrix[hor][ver];
              }
           }
            for(int ver =0; ver<lenR; ver++){
                 arAr[hor][ver] = ar[lenR-ver-1];
            }
        }
        assertArrayEquals(vertical,arAr);
    }
    @Test
    public void horizontal(){
        for (int hor = 0; hor < lenC; hor++) {
            if (lenR != lenC) {
                for (int ver = 0; ver < lenR; ver++) {
                    ar[ver] = matrix[ver][hor];
                }
            }
            else{
                for (int ver = 0; ver < lenR; ver++) {
                    ar[ver] = matrix[hor][ver];
                }
            }
            for(int ver =0; ver<lenR; ver++){
                arAr[lenC-1-hor][ver] = ar[ver];
            }
        }
        assertArrayEquals(horizontalTrue,arAr);
    }
}