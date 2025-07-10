
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

    }   
    public static int smallest(int[] array) {
            int small = array[0];
            for (int x: array){
                if (x < small) {
                    small = x;
                }
            }
            return small;
        }
    public static int indexOfSmallest(int[] array){
        int ind = 0;
        int iter = 0;
        int small = array[0];
            for (int x: array){
                
                
                if (x < small) {
                    small = x;
                    ind = iter;
                }
                iter++;
            }
            return ind;
        
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
        int iter = startIndex;
        int small = table[iter];
            for (int i = iter; i <(table.length); i++){
                
                
                if (table[i] < small) {
                    small = table[i];
                    iter = i;
                }
                
            }
            return iter;
    
    }
     public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
     public static void sort(int[] array){
         int iter = array.length -1;
         System.out.println(Arrays.toString(array));
         for (int i = 0; i<iter; i++){
             for (int j = i; j <array.length; j++){
                 int ismall = indexOfSmallestFrom(array,i);
                 swap(array, i, ismall);
                 System.out.println(Arrays.toString(array));
             }
         }
     }

}
