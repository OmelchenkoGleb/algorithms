package lessons1;

import java.util.Arrays;

public class pyzurkom {
    public static void main(String[] args) {
        int [] array = new int[] {15 , 62 , 14 , 16 , 21 , 6 , 9 , 51, 63 , 46 , 57};
        System.out.println(Arrays.toString(array));
        System.out.println("");
//        sorttwofor(array);
        sortwhile(array);
    }

    public static void sorttwofor(int [] array) {
        for(int i = 0 ; i< array.length; i++){
            for(int j = 0 ; j<array.length-1; j++) {
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void sortwhile(int [] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted=true;
            for(int i = 1; i<array.length; i++){
                if(array[i] < array[i-1]){
                    isSorted=false;
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
