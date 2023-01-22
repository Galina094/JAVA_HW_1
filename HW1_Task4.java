
//  Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Arrays;

public class HW1_Task4 {
    public static void main(String[] args) {

        int count=0;

        int[]arr = new int[(Short.MIN_VALUE/2)*(-1)];

        for (int i = 2; i < arr.length; i++) {

            count-=2;
            arr[i]=count;  
                   
        }
        System.out.println(Arrays.toString(arr));        
    }    
        
    }

