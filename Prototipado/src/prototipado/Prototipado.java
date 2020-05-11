/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipado;

/**
 *
 * @author reati
 */
public class Prototipado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] values = {20,50,2,3,1,4,5,6,4,5,6,5,80,9,7,4,5,6,4,5,2,3,1,5,2,4};

        for (int i = 0; i < 1; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                    System.out.println("numero encontrado" + index);
                    break;
                }
            }
        }
    }
    
}
