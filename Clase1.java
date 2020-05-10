package funcion;

import java.util.Random;

public class Clase1 {
    public static void main(String[] args) {


        int[] values = {20,50,2,3,1,4,5,6,4,5,6,5,8,9,7,4,5,6,4,5,2,3,1,5,2,4};

        for (int i = 0; i < 10000000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                    break;
                }
            }
        }
    }
}
