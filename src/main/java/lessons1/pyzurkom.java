package lessons1;

import java.util.Arrays;

public class pyzurkom {
    public static void main(String[] args) {
        int [] array = new int[] {15 , 62 , 14 , 16 , 21 , 6 , 9 , 51, 63 , 46 , 57};
        System.out.println(Arrays.toString(array));
        System.out.println("");
        sortpyzurkom(array);
    }

    public static void sortpyzurkom(int [] array){
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
