package lessons1;

import java.util.Arrays;

public class pyzurkom {
    public static void main(String[] args) {
        int [] array = new int[] {15 , 62 , 14 , 16 , 21 , 6 , 9 , 51, 63 , 46 , 74};
        sort(array);
    }

    public static void sort(int [] array) {
        for(int i=0 ; i< array.length; i++){
            for(int j =0 ; j<array.length; j++) {
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
