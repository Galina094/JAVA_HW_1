import java.util.Arrays;
import java.util.Random;

//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.

public class HW1_Task1 {

    static int[] CreateArr(){

        int[]arr = new int[10];

        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rnd.nextInt(2001);
        }
        System.out.println(Arrays.toString(arr));

        return arr;        
    }

    static void SortArr(int[]arr) {
        
        Random rnd = new Random();
        
        int randomIndex = rnd.nextInt(arr.length);        

        int rndElement = arr[randomIndex];
        System.out.println(rndElement); 
        System.out.println(randomIndex);

        int[]new_arr = new int[arr.length-1];
        
        System.arraycopy(arr, 0, new_arr, 0, randomIndex);
        System.arraycopy(arr, randomIndex+1, new_arr, randomIndex, new_arr.length-2);
        System.out.println(Arrays.toString(new_arr));

        // for (int i = 0; i < new_arr.length; i++) {
        //     if (arr[i]==(rndElement)) {
        //         continue;                                
        //     }   else {
        //         new_arr[i]=arr[i];                
        //     } 
        // Почему в цикле записывается 0 в новый массив? Я же ему continue делаю... Я же в новый массив пишу, а не старый меняю...
            
        }
    
    public static void main(String[] args) {        
        
        int[] new_arr = CreateArr();
        SortArr(new_arr);
        
    }


}
