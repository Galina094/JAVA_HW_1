import java.util.Arrays;

//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

public class HW1_Task3 {
    public static void main(String[] args) {

        int[]arr = new int[Short.MAX_VALUE/2];

        int count=0;

        for (int i = 0; i < arr.length; i++) {
            count+=2;
            arr[i]=count;                
            
        }
        System.out.println(Arrays.toString(arr));        
    }    
}
