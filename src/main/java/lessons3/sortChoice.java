package lessons3;

import java.util.Arrays;

public class sortChoice {
    public static void main(String[] args) {
        int [] array = new int[] {15 , 62 , 14 , 16 , 21 , 6 , 9 , 51, 63 , 46 , 57};
        System.out.println(Arrays.toString(array));
        System.out.println("");
        sortchoice(array);
    }

    public static void sortchoice(int [] array) {
        for(int i = 0 ; i < array.length; i++){
            int minindex = minvalueIndex(array,i);
            int temp = array[i];
            array[i] = array[minindex];
            array[minindex] = temp;
            System.out.println(Arrays.toString(array));
        }
    }


    public static int minvalueIndex(int [] array, int start){
        int minindex = start;
        for(int j = start+1 ; j<array.length-1; j++) {
            if(array[j] < array[minindex]){
                minindex = j;
            }
        }
        return minindex;
    }
}
